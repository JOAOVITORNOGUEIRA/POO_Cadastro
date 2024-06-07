package model;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String complemento;

    public Endereco(String rua, String numero, String bairro, String cidade, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + complemento;
    }
}
