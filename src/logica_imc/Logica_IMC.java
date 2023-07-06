package logica_imc;

import java.util.Scanner;
//@author Daniel Vieira
public class Logica_IMC {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void interpretarIMC(double imc) {
        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc <= 25) {
            System.out.println("Seu peso está dentro da faixa considerada saudável.");
        } else if (imc <= 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o peso em quilogramas: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        double imc = calcularIMC(peso, altura);
        interpretarIMC(imc);

        sc.close();
    }    
    
}