package espol.SeccionA.adapter;

public class PayPalExternalService {
    public void sendCryptoPayment(int tokens) {
        System.out.println("Pago procesado externamente en PayPal con " + tokens + " tokens.");
    }
}