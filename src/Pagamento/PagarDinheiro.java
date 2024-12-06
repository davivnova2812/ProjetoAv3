package Pagamento;

public class PagarDinheiro implements IPagamento{
    @Override
    public void pagar(int valor) {
        System.out.println("Pagando com dinheiro R$ "+valor);
    }
}
