public class Mago extends Personagem{
    public Mago(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    @Override
    public double calcularDano() {
        return getForcaBase() * getNivel() * 1.5 - 10;
    }
}