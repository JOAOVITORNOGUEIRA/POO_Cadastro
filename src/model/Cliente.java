package model;

public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String telefone, String sexo, Endereco endereco) {
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
