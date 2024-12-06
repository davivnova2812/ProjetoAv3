package Veiculo;

import Exibidor.IExibidor;

public class Moto extends Veiculo {
    private String tipo;

    public Moto(String tipo, String placa, String cor, String modelo) {
        super(placa, cor, modelo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Moto {" +
                "\n    tipo = '" + tipo + '\'' +
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
