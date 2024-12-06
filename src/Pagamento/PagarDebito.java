package Pagamento;

public class PagarDebito implements IPagamento{

    @Override
    public void pagar(int valor) {
        System.out.println("Pagando com débito R$ "+valor);
    }
}
