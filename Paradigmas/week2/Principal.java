
public class Principal{
    public static void main(String[] args) {
        Pessoa[] vet = new Pessoa[2];
        vet[0] = new Pessoa("Grace Hopper");
        vet[1] = new Pessoa("Ada Lovelace");

        vet[0].ajustarDataDeNascimento(9, 12, 1906);
        vet[1].ajustarDataDeNascimento(10, 12, 1815);

        vet[0].calcularIdade(2, 10, 2026);
        vet[1].calcularIdade(2, 10, 2026);   
        System.out.printf("Grace %d anos Ada %d anos\n", vet[0].retornarIdade(), vet[1].retornarIdade());
    }
}

