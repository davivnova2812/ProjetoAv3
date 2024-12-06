package LavaJato;

import Exibidor.IExibidor;
import Funcionario.Funcionario;
import Veiculo.*;

import java.util.ArrayList;
import java.util.List;

public class LavaJatoMoto extends LavaJato implements IExibidor {
    private List<Moto> listaDeMoto;

    public LavaJatoMoto(String cnpj, String endereco) {
        super(cnpj, endereco);
        this.listaDeMoto = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        Moto moto = (Moto) veiculo;
        listaDeMoto.add(moto);
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        Moto moto = (Moto) veiculo;
        listaDeMoto.remove(moto);
    }

    @Override
    public void exibirVeiculos() {
        for (int i = 0; i < listaDeMoto.size(); i++) {
            System.out.print(i + " - ");
            listaDeMoto.get(i).exibir();
        }
    }

    @Override
    public Veiculo buscarVeiculo(int i) {
        return listaDeMoto.get(i);
    }

    @Override
    public String toString() {
        return "LavaJatoMoto {" +
                "\n    cnpj = '" + cnpj + '\'' +
                "\n    endereço = '" + endereco + '\'' +
                "\n}";
    }


    @Override
    public void exibir() {
        System.out.println(this);
    }
}
