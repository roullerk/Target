/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. 
*/

public class Questão4 {
  public static void main( String[] args) {
      double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53, total = 0,
      percentual_sp = 0, percentual_rj = 0, percentual_mg = 0, percentual_es = 0, percentual_outros = 0;


    total = sp + rj + mg + es + outros;

    percentual_sp = (sp / total) * 100;
    percentual_rj = (rj / total) * 100;
    percentual_mg = (mg / total) * 100;
    percentual_es = (es / total) * 100;
    percentual_outros = (outros / total) * 100;

    System.out.printf("Percentual de  representação de SP : %.1f" , percentual_sp , "%");
    System.out.println();
    System.out.printf("Percentual de  representação de RJ : %.1f" , percentual_rj , "%");
    System.out.println();
    System.out.printf("Percentual de  representação de MG : %.1f" , percentual_mg , "%");
    System.out.println();
    System.out.printf("Percentual de  representação de ES : %.1f" , percentual_es , "%");
    System.out.println();
    System.out.printf("Percentual de  representação de Outros : %.1f" , percentual_outros , "%");

  }  
}
