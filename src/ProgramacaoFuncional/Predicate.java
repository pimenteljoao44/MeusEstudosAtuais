package ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Predicate {
    public static void main(String[] args) {

        List<Product> liistaDeProdutos = new ArrayList<>();

        //Remover da lista somete aquele cujo preço minimo seja 100

        liistaDeProdutos.add(new Product("Tv",900.00));
        liistaDeProdutos.add(new Product("Mouse",50.00));
        liistaDeProdutos.add(new Product("Tablet",350.00));
        liistaDeProdutos.add(new Product("HD case",89.90));

        liistaDeProdutos.removeIf(product ->  product.getPrice() >=100);

        for (Product p:liistaDeProdutos) {
            System.out.println(p.toString());
        }


    }
}
