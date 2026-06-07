package espol.SeccionA.adapter;

public class PayPalAdapter implements ProcesadorDePago {
    private PayPalExternalService paypalExterno;
    public PayPalAdapter(PayPalExternalService paypalExterno) {
        this.paypalExterno = paypalExterno;
    }
    @Override
    public void procesarCobro(double monto) {
        int tokens = (int) (monto * 10);
        paypalExterno.sendCryptoPayment(tokens);
    }
}