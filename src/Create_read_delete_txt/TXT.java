package Create_read_delete_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TXT {

    public static void main (String[]args) throws IOException {


        Path path = Path.of("C:\\teste\\texto.txt");
     /*
        if(Files.notExists(path)) {
            Files.createFile(path);
        }
          String texto = "Oi tudo bem?";
           Files.writeString(path,texto);
     */

     /* List <String> strings = Files.readAllLines(path);

      for (String texto: strings){
          System.out.println(texto);
      }

      */

        Files.delete(path);
    }
}
