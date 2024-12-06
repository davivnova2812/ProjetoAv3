package LavaJato;

import Funcionario.Funcionario;
import Veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public abstract class LavaJato {
    protected String cnpj;
    protected String endereco;
    protected List<Funcionario> listaFuncionario;

    public LavaJato(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.listaFuncionario = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public abstract void adicionarVeiculo(Veiculo veiculo);
    public abstract void removerVeiculo(Veiculo veiculo);
    public abstract void exibirVeiculos();
    public abstract Veiculo buscarVeiculo(int i);

    public void adicionarFuncionario(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        listaFuncionario.remove(funcionario);
    }

    public void exibirFuncionario(){
        for (int i = 0; i < listaFuncionario.size(); i++) {
            System.out.print(i + " - ");
            listaFuncionario.get(i).exibir();
        }
    }
    public Funcionario buscarFuncionario(int i){
       return listaFuncionario.get(i);
    }
}
