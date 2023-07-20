package Interface;

public class Test {
    public static void main(String[] args) {
        ContaInterface corrente = new ContaCorrente();
         corrente.setSaldo(10);

        ContaInterface poupanca = new ContaPolpança();
         poupanca.setSaldo(10);

        System.out.println(poupanca.getSaldo());
    }
}
