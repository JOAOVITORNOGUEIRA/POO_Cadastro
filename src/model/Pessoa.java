package model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String sexo;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String telefone, String sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public abstract void seApresentar();

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Endereço: " + endereco);
    }
}
