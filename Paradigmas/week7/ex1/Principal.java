import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Personagem> personagens = new TreeSet<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Cadastro do personagem " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Nivel: ");
            int nivel = scanner.nextInt();
            System.out.print("Forca base: ");
            double forcaBase = scanner.nextDouble();
            scanner.nextLine();

            int tipo = i % 3;
            if (tipo == 0) {
                personagens.add(new Guerreiro(nome, nivel, forcaBase));
            } else if (tipo == 1) {
                personagens.add(new Mago(nome, nivel, forcaBase));
            } else {
                personagens.add(new Arqueiro(nome, nivel, forcaBase));
            }
        }

        System.out.println("\nPersonagens em ordem decrescente de dano:");
        for (Personagem personagem : personagens) {
            System.out.println(personagem.getNome() + " - Dano: " + personagem.calcularDano());
        }

        scanner.close();
    }
}