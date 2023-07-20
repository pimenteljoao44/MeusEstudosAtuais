package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        // tem uma lista de inteiros
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
         // foi criada uma stream aprtir dessa lista
        // passa uma função map, que multiplica cada elemento da lista por 10
        Stream<Integer> stm1 = list.stream().map(x -> x *10);

        // nessa linha o to array é uma função terminal, que retorna um array apartir da stream consumida
        System.out.println(Arrays.toString(stm1.toArray()));

        /*********************************************************************/

        // Agora vamos pegar a lista e somar os elementos da lista

        int sum = list.stream().reduce(0,(x,y)-> x + y);
        System.out.println(sum);
    }
}
