import Funcionario.*;
import LavaJato.*;
import Pagamento.*;
import Veiculo.*;

import java.util.Scanner;

public class Main {
    static LavaJato lavaJatoMoto = new LavaJatoMoto("267612639","Rua aghauihauishdui");

    static LavaJato lavaJatoCarro = new LavaJatoCarro("19827818","Rua bsiohjdioashd");

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.print("""
                Selecione o Lava-Jato: 
                1 - Carro
                2 - Moto
                0 - Sair
                Sua escolha:\s """);

        int escolha1 = qualquerCoisa();
        switch (escolha1){
            case 1 -> {
                subMenuCarro();
            }
            case 2 -> {
                subMenuMoto();
            }
            case 0 -> {
                return;
            }
        }
        menu();
    }

    public static void subMenuMoto(){
        System.out.print("""
                Selecione a ação: 
                1 - Adicionar funcionário
                2 - Remover funcionário
                3 - Adicionar moto
                4 - Remover moto
                5 - Exibir funcionário
                6 - Exibir moto
                0 - Sair
                Sua escolha:\s """);
        int escolha2 = qualquerCoisa();
        switch(escolha2){
            case 1 -> {
                System.out.print("""
                Selecione a ação: 
                1 - Lavador
                2 - Gerente
                Sua escolha:\s """);
                int c1 = qualquerCoisa();
                switch (c1){
                    case 1 -> {
                        Scanner prompt = new Scanner(System.in);
                        System.out.println("Digite o nome: ");
                        String nome = prompt.nextLine();
                        System.out.println("Digite o cpf: ");
                        String cpf = prompt.nextLine();
                        System.out.println("Digite o salário: ");
                        double salarioBase = qualquerCoisa2();
                        System.out.println("Digite o bônus: ");
                        double bonusLavador = qualquerCoisa2();

                        Funcionario f1 = new Lavador(nome, cpf, salarioBase, bonusLavador);
                        lavaJatoMoto.adicionarFuncionario(f1);
                    }
                    case 2 -> {
                        Scanner prompt = new Scanner(System.in);
                        System.out.println("Digite o nome: ");
                        String nome = prompt.nextLine();
                        System.out.println("Digite o cpf: ");
                        String cpf = prompt.nextLine();
                        System.out.println("Digite o salário: ");
                        double salarioBase = qualquerCoisa2();
                        System.out.println("Digite o bônus: ");
                        double bonusGerente = qualquerCoisa2();

                        Funcionario f1 = new Gerente(nome, cpf, salarioBase, bonusGerente);
                        lavaJatoMoto.adicionarFuncionario(f1);
                    }
                }
            }
            case 2 ->{
                lavaJatoMoto.exibirFuncionario();
                int e1 = qualquerCoisa();
                Funcionario f1 = lavaJatoMoto.buscarFuncionario(e1);
                lavaJatoMoto.removerFuncionario(f1);
            }
            case 3 ->{
                Scanner prompt = new Scanner(System.in);
                System.out.println("Digite a placa");
                String placa = prompt.nextLine();
                System.out.println("Digite a cor");
                String cor = prompt.nextLine();
                System.out.println("Digite o modelo");
                String modelo = prompt.nextLine();
                System.out.println("Digite o tipo");
                String tipo = prompt.nextLine();

                Veiculo c1 = new Moto(placa, cor,modelo,tipo);
                lavaJatoMoto.adicionarVeiculo(c1);
            }
            case 4 ->{
                lavaJatoMoto.exibirVeiculos();
                int e1 = qualquerCoisa();
                Moto c1 = (Moto) lavaJatoMoto.buscarVeiculo(e1);
                lavaJatoMoto.removerVeiculo(c1);
                System.out.print("""
                Selecione o tipo de pagamento: 
                1 - Crédito
                2 - Débito
                3 - Pix
                4 - Dinheiro
                Sua escolha:\s """);
                int k9 = qualquerCoisa();
                switch (k9){
                    case 1 -> {
                        IPagamento p = new PagarCredito();
                        p.pagar(50);
                    }
                    case 2 -> {
                        IPagamento p = new PagarDebito();
                        p.pagar(50);
                    }
                    case 3 -> {
                        IPagamento p = new PagarPix();
                        p.pagar(50);
                    }
                    case 4 -> {
                        IPagamento p = new PagarDinheiro();
                        p.pagar(50);
                    }
                }
            }
            case 5 ->{
                lavaJatoMoto.exibirFuncionario();
            }
            case 6 ->{
                lavaJatoMoto.exibirVeiculos();
            }
        }
    }

    public static void subMenuCarro(){
        System.out.print("""
                Selecione a ação: 
                1 - Adicionar funcionário
                2 - Remover funcionário
                3 - Adicionar carro
                4 - Remover carro
                5 - Exibir funcionário
                6 - Exibir carro
                0 - Sair
                Sua escolha:\s """);
        int escolha1 = qualquerCoisa();
        switch (escolha1){
            case 1 -> {
                System.out.print("""
                Selecione a ação: 
                1 - Lavador
                2 - Gerente
                Sua escolha:\s """);
                int c1 = qualquerCoisa();
                switch (c1){
                    case 1 -> {
                        Scanner prompt = new Scanner(System.in);
                        System.out.println("Digite o nome: ");
                        String nome = prompt.nextLine();
                        System.out.println("Digite o cpf: ");
                        String cpf = prompt.nextLine();
                        System.out.println("Digite o salário: ");
                        double salarioBase = qualquerCoisa2();
                        System.out.println("Digite o bônus: ");
                        double bonusLavador = qualquerCoisa2();

                        Funcionario f1 = new Lavador(nome, cpf, salarioBase, bonusLavador);
                        lavaJatoCarro.adicionarFuncionario(f1);
                    }
                    case 2 -> {
                        Scanner prompt = new Scanner(System.in);
                        System.out.println("Digite o nome: ");
                        String nome = prompt.nextLine();
                        System.out.println("Digite o cpf: ");
                        String cpf = prompt.nextLine();
                        System.out.println("Digite o salário: ");
                        double salarioBase = qualquerCoisa2();
                        System.out.println("Digite o bônus: ");
                        double bonusGerente = qualquerCoisa2();

                        Funcionario f1 = new Gerente(nome, cpf, salarioBase, bonusGerente);
                        lavaJatoCarro.adicionarFuncionario(f1);
                    }
                }
            }
            case 2 -> {
                lavaJatoCarro.exibirFuncionario();
                int e1 = qualquerCoisa();
                Funcionario f1 = lavaJatoCarro.buscarFuncionario(e1);
                lavaJatoCarro.removerFuncionario(f1);
            }
            case 3 -> {
                Scanner prompt = new Scanner(System.in);
                System.out.println("Digite a placa");
                String placa = prompt.nextLine();
                System.out.println("Digite a cor");
                String cor = prompt.nextLine();
                System.out.println("Digite o modelo");
                String modelo = prompt.nextLine();
                System.out.println("Digite o tamanho");
                String tamanho = prompt.nextLine();

                Veiculo c1 = new Carro(placa, cor,modelo,tamanho);
                lavaJatoCarro.adicionarVeiculo(c1);
            }
            case 4 -> {
                lavaJatoCarro.exibirVeiculos();
                int e1 = qualquerCoisa();
                Carro c1 = (Carro) lavaJatoCarro.buscarVeiculo(e1);
                lavaJatoCarro.removerVeiculo(c1);
                System.out.print("""
                Selecione o tipo de pagamento: 
                1 - Crédito
                2 - Débito
                3 - Pix
                4 - Dinheiro
                Sua escolha:\s """);
                int t1 = qualquerCoisa();
                switch (t1){
                    case 1 -> {
                        IPagamento p = new PagarCredito();
                        p.pagar(50);
                    }
                    case 2 -> {
                        IPagamento p = new PagarDebito();
                        p.pagar(50);
                    }
                    case 3 -> {
                        IPagamento p = new PagarPix();
                        p.pagar(50);
                    }
                    case 4 -> {
                        IPagamento p = new PagarDinheiro();
                        p.pagar(50);
                    }
                }

            }
            case 5 -> {
                lavaJatoCarro.exibirFuncionario();
            }
            case 6 -> {
                lavaJatoCarro.exibirVeiculos();
            }
            case 0 -> {
                return;
            }
        }
        subMenuCarro();
    }

    public static int qualquerCoisa(){
        Scanner prompt =  new Scanner(System.in);
        int escolha1 = 0;
        try {
             escolha1 = Integer.parseInt(prompt.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Insira um número válido!!!!");
            qualquerCoisa();
        }
        return escolha1;
    }

    public static double qualquerCoisa2(){
        Scanner prompt =  new Scanner(System.in);
        double escolha1 = 0;
        try {
            escolha1 = Double.parseDouble(prompt.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Insira um número válido!!!!");
            qualquerCoisa2();
        }
        return escolha1;
    }
}