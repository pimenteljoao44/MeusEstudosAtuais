package Trabalhando_com_arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        // lendo um arquivo
        File file = new File("C:\\Users\\User\\Desktop\\myProjects\\in.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
          while (scanner.hasNextLine()){
              System.out.println(scanner.nextLine());
          }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
         if (scanner != null){
             scanner.close();

         }
        }
    }
}
