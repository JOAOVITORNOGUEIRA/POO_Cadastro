import model.Cliente;
import model.Endereco;
import model.Vendedor;

public class App {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "123", "Bairro A", "Cidade A", "Apto 1");
        Endereco endereco2 = new Endereco("Rua B", "456", "Bairro B", "Cidade B", "Casa 2");
        Endereco endereco3 = new Endereco("Rua C", "789", "Bairro C", "Cidade C", "Casa 3");

        Cliente cliente1 = new Cliente("João", "111.111.111-11", "1234-5678", "Masculino", endereco1);
        Vendedor vendedor1 = new Vendedor("Maria", "222.222.222-22", "8765-4321", "Feminino", endereco2);
        Cliente cliente2 = new Cliente("Pedro", "333.333.333-33", "5678-1234", "Masculino", endereco3);

        cliente1.exibirDetalhes();
        System.out.println();
        vendedor1.exibirDetalhes();
        System.out.println();
        cliente2.exibirDetalhes();
    }
}
