

public class Main {

    public static void main(String[] args){


        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.Soma(2,2);
        Calculadora.Subtracao(10,2);
        Calculadora.Multiplicacao(10,10);
        Calculadora.Divisao(20,10);

        // Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Emprestimo");
        Emprestimo.calcular(10000,2);


    }


}
