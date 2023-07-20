package Trabalhando_com_arquivos.manipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class mainPastas {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);


        System.out.println("Enter whith folder path:");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // cria um vetor de pastas
        File[] folsers = path.listFiles(File::isDirectory);
        System.out.println("Folders:");

        // imprime o caminho de diretorios
        for (File folder :folsers) {
            System.out.println(folder);
        }
        scanner.close();
    }
}
