public class Principal{
    public static void main(String args[]){
        Data data = new Data(23, 3, 2007);
        Endereco end = new Endereco("Rua Professora Doracy Cezzarino", 138);

        Pessoa p1 = new Pessoa("Gabriel Melo", "Estudante", end, data);

        p1.imprimir();
    }
}