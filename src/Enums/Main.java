package Enums;

import Enums.Entyties.Order;

import java.util.Date;

/*
* Primeiro vamos entender oque são os enumeradores, eles são consuntos de valores pré definidos, Ex: num sistema
* de um curso, o curso pode acontecer em tres periodos: MANHÃ, TARDE E NOITE, é algo pé definido que não se altera
**/
public class Main {
    public static void main(String[] args){
        Order order = new Order(1080,new Date(),OrderStatus.PENDING_PAAYMENT);

        System.out.println(order);
        OrderStatus os1 = OrderStatus.DEVILERED;

        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
