public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    @Override
    public double calcularDano() {
        return getForcaBase() * getNivel() * 1.2;
    }
}