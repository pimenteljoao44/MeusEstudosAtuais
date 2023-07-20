package Algoritmos;

import java.math.BigDecimal;

public class myClass {

    public double media(double n1, double n2, double n3){
        return n1 + n2 + n3 /3;
    }

    public void aumento(double salario) {
        double novoSalario = salario * 1.25;
        System.out.print(novoSalario);
    }

     public void novoSalario(double salario){
        if (salario >= 500){
           double novoSalario = salario * 1.20;
            System.out.println(novoSalario);
        }else{
            double novoSalario = salario * 1.10;
            System.out.println(novoSalario);
        }
     }

     public void rendimento(double valor){
        int mes=0;
         for (int i =0; mes<=12; i++ ){
             double valorRendido = valor * 1.10;
             System.out.println(valorRendido);
             break;
         }
     }

      public void percentualAumnto(double salario, double percntual){
         double novoSal = salario * percntual;
          System.out.println(novoSal);
      }

      public BigDecimal media(BigDecimal n1,BigDecimal n2){
        BigDecimal media = n1.add(n2).divide(BigDecimal.valueOf(2));
        return media;
      }

      public int calculadora(int n1, int n2, String sinal){
          if (sinal == "+") {
             int  soma = n1 + n2;
              System.out.println(soma);
          }
          if (sinal == "-"){
             int subtr = n1 - n2;
              System.out.println(subtr);
          }
          if (sinal == "*"){
              int mult = n1 * n2;
              System.out.println(mult);
          }
          if (sinal == "/"){
              int div = n1 / n2;
              System.out.println(div);
          }
          return 0;
      }
}
