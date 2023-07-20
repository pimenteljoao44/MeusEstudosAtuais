package Generics;
/*Genérics uma característica da linguagem que permite criar classes, interfaces e métodos
 que possam ser parametrizados por um tipo de dados específico. Essa parametrização
  é feita através do uso de tipos genéricos, também conhecidos como "parâmetros de tipo",
   que podem ser especificados quando uma instância da classe ou interface é criada
    ou quando um método é invocado.*/
public class Generic<T> {
    private T value;

    public void add(T value){
       this.value = value;
    }
    public T getValue() {
        return  this.value;
    }
}
