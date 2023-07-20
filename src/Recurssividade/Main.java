package Recurssividade;

public class Main {
    public static void main(String[] args){

        int fatorialn = 5;
        fatorial(fatorialn);
    }
    private static void fatorial(int number){
        int total = 1;
        for (int i = number;i>1;i--){
            total = total * i;
        }
        System.out.println(total);
    }

    private static  int recursividade(int number){
        if (number == 1){
            return 1;
        }

        return number * recursividade(number - 1);
    }
}
