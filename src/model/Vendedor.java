package model;

public class Vendedor extends Pessoa {
    public Vendedor(String nome, String cpf, String telefone, String sexo, Endereco endereco) {
        super(nome, cpf, telefone, sexo, endereco);
    }

    @Override
    public void seApresentar() {
        System.out.println("Prazer, meu nome é " + getNome() + ".");
    }

    @Override
    public void exibirDetalhes() {
        seApresentar();
        super.exibirDetalhes();
    }
}
