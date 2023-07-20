package Interface;

public class ContaCorrente implements ContaInterface{

     private Integer saldo;


    @Override
    public void setSaldo(Integer saldo) {
       this.saldo = saldo;
    }

    @Override
    public Integer getSaldo() {
        return this.saldo;
    }

    @Override
    public Integer getReandimento() {
        return this.saldo * 2;
    }
}
