/*5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;  
*/

import java.util.Scanner;

public class Questao5 {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua palavra : ");
    String palavra = sc.next();
    String invertida = "";

    for ( int i = palavra.length() - 1 ; i >= 0 ; i--){
        invertida += palavra.charAt(i);
    }

    System.out.println("Sua palavra invertida é : " + invertida);

    sc.close();
   } 
}
