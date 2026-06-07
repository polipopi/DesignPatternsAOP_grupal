package espol.SeccionA.adapter;

public class PasarelaLocalEfectivo implements ProcesadorDePago {
    @Override
    public void procesarCobro(double monto) {
        System.out.println("Procesando pago local en efectivo de: $" + monto);
    }
}

