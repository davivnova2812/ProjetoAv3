package Funcionario;

import Exibidor.IExibidor;

public class Lavador extends Funcionario {
    private double bonusLavador;

    public Lavador(String nome, String cpf, double salarioBase, double bonusLavador) {
        super(nome, cpf, salarioBase);
        this.bonusLavador = bonusLavador;
    }

    public double getBonusLavador() {
        return bonusLavador;
    }

    public void setBonusLavador(double bonusLavador) {
        this.bonusLavador = bonusLavador;
    }
    public void lavar(){
        System.out.println("Lavando!");
    }

    @Override
    public String toString() {
        return "Lavador{" +
                "bonusLavador=" + bonusLavador +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void exibir() {
        System.out.println(this);
    }
}
