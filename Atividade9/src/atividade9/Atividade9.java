package atividade9;

/**
 *
 * @author Mendes 
 * data: 12/03/2025
 */
public class Atividade9 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(5, 8);
        System.out.println("Resultado 1: " + resultado1);
        double resultado2 = calc.somar(3.5, 2.7);
        System.out.println("Resultado 2: " + resultado2);
        int resultado3 = calc.somar(5, 4, 3);
        System.out.println("Resultado 3: " + resultado3);
        

    }

}
