public class TesteContatoTelefonico{
    public static void main(String args[]){
        ContatoTelefonico c1 = new ContatoTelefonico("Joao Silva", "(11)99999-9999");
        ContatoTelefonico c2 = new ContatoTelefonico("Lurdes dos Anjos", "(11)98888-8888");
        ContatoTelefonico c3 = new ContatoTelefonico("Lucas Menezes", "(11)97777-7777");

        System.out.printf("Contato 1 - nome: %s, telefone: %s\n", c1.getNome(), c1.getTelefone());
        System.out.printf("Contato 2 - nome: %s, telefone: %s\n", c2.getNome(), c2.getTelefone());
        System.out.printf("Contato 3 - nome: %s, telefone: %s\n", c3.getNome(), c3.getTelefone());
    }
}