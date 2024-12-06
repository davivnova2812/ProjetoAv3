package Pagamento;

public class PagarCredito implements IPagamento{

    @Override
    public void pagar(int valor) {
        System.out.println("Pagando com crédito R$ "+ valor);
    }
}
