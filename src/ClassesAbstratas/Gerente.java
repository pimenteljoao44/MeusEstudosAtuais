package ClassesAbstratas;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void addBonus(double valorBunusPercent) {
        this.salario = salario + salario * valorBunusPercent;
    }

    @Override
    public void imprime() {

    }
}
