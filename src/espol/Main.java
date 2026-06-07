package espol;
import espol.SeccionA.adapter.*;
import espol.SeccionA.singleton.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba");

        System.out.println("\n--- Diseño Singleton ---");
        ConexionPasarelaSingleton conexion1 = ConexionPasarelaSingleton.getInstancia();
        ConexionPasarelaSingleton conexion2 = ConexionPasarelaSingleton.getInstancia();
        if (conexion1 == conexion2) {
            System.out.println("[ÉXITO] Ambas variables apuntan a la misma instancia en memoria.");
        }
        conexion1.enviarTokenSeguridad("TXT-9921-SECURE");

        System.out.println("\n--- Diseño Adapter ---");
        ProcesadorDePago pagoLocal = new PasarelaLocalEfectivo();
        pagoLocal.procesarCobro(25.50);
        PayPalExternalService servicioExternoIncompatible = new PayPalExternalService();
        ProcesadorDePago adaptadorPayPal = new PayPalAdapter(servicioExternoIncompatible);
        adaptadorPayPal.procesarCobro(100.00); 
    }
}