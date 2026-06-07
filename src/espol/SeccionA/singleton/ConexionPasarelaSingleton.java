package espol.SeccionA.singleton;

public class ConexionPasarelaSingleton {
    private static ConexionPasarelaSingleton instancia;

    private ConexionPasarelaSingleton() {
        System.out.println("[SINGLETON] Conexión SEGURA establecida con el servidor de pagos.");
    }

    public static ConexionPasarelaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConexionPasarelaSingleton(); 
        }
        return instancia;
    }

    public void enviarTokenSeguridad(String token) {
        System.out.println("[SINGLETON] Token de autorización '" + token + "' validado con éxito.");
    }
}