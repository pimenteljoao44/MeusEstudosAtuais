package Lambadas_streamAPIS;

public class Cliente {
    private String nome;
    private Integer idade;

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
         this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
