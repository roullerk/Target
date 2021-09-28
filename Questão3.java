/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;  */


import java.util.Scanner;

public class Questão3 {
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        int  diasMaiorQueMedia = 0, i;
        double faturamento[], menor = 0, maior = 0, media = 0, soma = 0;

        faturamento =  new double[21];
        
        for ( i = 0 ; i < faturamento.length; i++){
            System.out.println("Digite o valor do faturamento do dia : ");
            faturamento[i] = sc.nextDouble();
            soma += faturamento[i];
        }
        media = soma / faturamento.length;
        maior = faturamento[0];
        menor = faturamento[0];

        for (i = 0 ; i < faturamento.length; i++){
            if ( media < faturamento[i]){
                diasMaiorQueMedia += 1;
            }
            if ( maior < faturamento[i]){
                maior = faturamento[i];
            }
            if ( menor > faturamento[i]){
                menor = faturamento[i];
            }
        }
        
        System.out.println("O menor valor de faturamento diário é : " + menor);
        System.out.println("O maior valor de faturamento diário é : " + maior);
        System.out.println("O número de dias em que o faturamento foi maior que a média é : " + diasMaiorQueMedia);
   
        sc.close();
    }
}
