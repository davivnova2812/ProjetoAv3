package Pagamento;

public class PagarPix implements IPagamento{
    @Override
    public void pagar(int valor) {
        System.out.println("Pagando com pix R$ "+valor);
    }
}
