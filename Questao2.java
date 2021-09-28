/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;   */


import java.util.Scanner;

public class Questao2 {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    int valor1 = 0, valor2 = 1, auxiliar, i, numero, comparador = 0;

    System.out.println("Digite um número para verificar se faz parte da Sequência : ");
    numero = sc.nextInt();

    if ( numero < 0 ) {
        System.out.println("Número inválido");
    }    else {
            for ( i = 0 ; i < 100 ; i++){
                auxiliar = valor1 + valor2;
                valor1 = valor2;
                valor2 = auxiliar;
                if( numero == valor1 || numero == valor2 || numero ==  auxiliar){
                 comparador += 1;   
                }
            }
        }
        if ( comparador > 0 ) {
            System.out.println("Sim, o número " + numero + " pertence a sequência");
        }
        else{
            System.out.println("O número " + numero + " não pertence a sequência");
        }
        
        sc.close();
  }
}