package Funcionario;

import Exibidor.IExibidor;

public class Gerente extends Funcionario {
    private double bonusGerente;

    public Gerente(String nome, String cpf, double salarioBase, double bonusGerente) {
        super(nome, cpf, salarioBase);
        this.bonusGerente = bonusGerente;
    }
    public double getBonusGerente() {
        return bonusGerente;
    }

    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonusGerente=" + bonusGerente +
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
