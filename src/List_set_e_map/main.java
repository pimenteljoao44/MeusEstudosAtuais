package List_set_e_map;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        List <Integer> lista;

        lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(null);
        lista.add(null);
        lista.add(1);

        for (Integer o:lista) {
            System.out.println(o);
        }
        System.out.println(lista);






    }
}
