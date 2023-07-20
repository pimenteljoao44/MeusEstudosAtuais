package ClassesAbstratas;

public class teste {
    public static void main(String[] args) {
//        Desenvolvedor desenvolvedor = new Desenvolvedor("Jão",800);
//        desenvolvedor.addBonus(0.1);
//        System.out.println(desenvolvedor.salario);

        Gerente gerente = new Gerente("Marcio",800);
        gerente.addBonus(0.1);
        System.out.println(gerente.salario);
    }
}
