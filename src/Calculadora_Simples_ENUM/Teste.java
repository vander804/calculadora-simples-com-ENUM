package Calculadora_Simples_ENUM;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int o = 0;
        while(o != 5){
            System.out.println("qual operação sera relizada ?");
            System.out.println("1 para soma");
            System.out.println("2 para subtração");
            System.out.println("3 para multiplicação");
            System.out.println("4 para divisão");
            System.out.println("5 para sair");
            o = scan.nextInt();
            if (o == 1) {
                impoperacoes(Operacoes.SOMA);
            } else if (o == 2) {
                impoperacoes(Operacoes.SUBTRAIR);
            } else if (o == 3) {
                impoperacoes(Operacoes.MULTIPLICACAO);
            } else if (o == 4) {
                impoperacoes(Operacoes.DIVISAO);
            }
        }
    }
    private static void impoperacoes(Operacoes op){
        double x, y, w;
        Scanner scan = new Scanner(System.in);
            switch (op) {
                case SOMA:
                    System.out.println("qual o primeiro numero da soma ?");
                    x = scan.nextDouble();
                    System.out.println("qual o segundo numero da soma ?");
                    y = scan.nextDouble();
                    w = Operacoes.SOMA.executarOperacoes(x,y);
                    System.out.println(w);
                    break;
                case SUBTRAIR:
                    System.out.println("qual o primeiro numero da subtração ?");
                    x = scan.nextDouble();
                    System.out.println("qual o segundo numero da subtração ?");
                    y = scan.nextDouble();
                    w = Operacoes.SUBTRAIR.executarOperacoes(x,y);
                    System.out.println(w);
                    break;
                case MULTIPLICACAO:
                    System.out.println("qual o primeiro numero da multiplicação ?");
                    x = scan.nextDouble();
                    System.out.println("qual o segundo numero da multiplicação ?");
                    y = scan.nextDouble();
                    w = Operacoes.MULTIPLICACAO.executarOperacoes(x,y);
                    System.out.println(w);
                    break;
                case DIVISAO:
                    System.out.println("qual o primeiro numero da divisão ?");
                    x = scan.nextDouble();
                    System.out.println("qual o segundo numero da divisão ?");
                    y = scan.nextDouble();
                    w = Operacoes.DIVISAO.executarOperacoes(x,y);
                    System.out.println(w);
                    break;
            }
    }
}

