package Lambadas_streamAPIS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Cliente> clientes = new ArrayList<>();
         clientes.add(new Cliente("João",18));
         clientes.add(new Cliente("Jacó",22));
         clientes.add(new Cliente("Pedro",18));
        clientes.add(new Cliente("Cezar",19));
        clientes.add(new Cliente("Lucas",24));
        clientes.add(new Cliente("fabra",18));
        clientes.add(new Cliente("Fulupao",18));

        for (Cliente v:clientes){
            System.out.println(v.getNome());
        }
    }
}
