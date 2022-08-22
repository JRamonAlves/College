package CalculadoraJava;

class Main {
    
    public static void main(String [] arg) {

        Calculadora calc = new Calculadora();

        calc.valor1 = 20;
        calc.valor2 = 30;

        System.out.println(calc.soma(80,100));
    }
}