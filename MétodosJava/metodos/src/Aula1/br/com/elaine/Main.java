package Aula1.br.com.elaine;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 9);
        Calculadora.subtracao(15, 5);
        Calculadora.multiplicacao(100, 10.5);
        Calculadora.divisao(10, 2.5);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);


        //Emprestimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
