package Veiculo;

import Exibidor.IExibidor;

public class Carro extends Veiculo {
    private String tamanho;

    public Carro(String placa, String cor, String modelo, String tamanho) {
        super(placa, cor, modelo);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "\n    tamanho = '" + tamanho + '\'' +
                "\n    placa = '" + placa + '\'' +
                "\n    cor = '" + cor + '\'' +
                "\n    modelo = '" + modelo + '\'' +
                "\n}";
    }


    @Override
    public void exibir() {
        System.out.println(this);
    }
}
