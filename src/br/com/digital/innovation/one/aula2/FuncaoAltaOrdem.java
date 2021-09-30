package br.com.digital.innovation.one.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b, c) -> a + b + c;
        Calculo SUB = (a, b, c) -> a - b - c;
        Calculo MULT = (a, b, c) -> a * b * c;
        Calculo DIV = (a, b, c) -> a / b / c;

        System.out.println(executarOperacao(SOMA, 1, 3, 5));
        System.out.println(executarOperacao(SUB, 1, 3, 5));
        System.out.println(executarOperacao(MULT, 1, 3, 5));
        System.out.println(executarOperacao(DIV, 1, 3, 5));
    }


    public static int executarOperacao(Calculo calculo, int a, int b, int c) {
        return calculo.calcular(a, b, c);
    }
}


@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b, int c);
}