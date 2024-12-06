package LavaJato;

import Exibidor.IExibidor;
import Funcionario.Funcionario;
import Veiculo.*;


import java.util.ArrayList;
import java.util.List;

public class LavaJatoCarro extends LavaJato implements IExibidor {
    private List<Carro> listaDeCarro;


    public LavaJatoCarro(String cnpj, String endereco) {
        super(cnpj, endereco);
        this.listaDeCarro = new ArrayList<>();
        this.listaFuncionario = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        Carro carro = (Carro) veiculo;
        listaDeCarro.add(carro);
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        Carro carro = (Carro) veiculo;
        listaDeCarro.remove(carro);
    }

    @Override
    public void exibirVeiculos() {
        for (int i = 0; i < listaDeCarro.size(); i++) {
            System.out.print(i + " - ");
            listaDeCarro.get(i).exibir();
        }
    }

    @Override
    public Veiculo buscarVeiculo(int i) {
       return listaDeCarro.get(i);
    }

    @Override
    public String toString() {
        return "LavaJatoCarro {" +
                "\n    cnpj = '" + cnpj + '\'' +
                "\n    endereco = '" + endereco + '\'' +
                "\n}";
    }


    @Override
    public void exibir() {
        System.out.println(this);
    }
}
