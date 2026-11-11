public abstract class Personagem implements Comparable<Personagem>{
    protected String nome;
    protected int nivel;
    protected double forcaBase;

    public Personagem(String nome, int nivel, double forcaBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.forcaBase = forcaBase;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNivel() {
        return this.nivel;
    }

    public double getForcaBase() {
        return this.forcaBase;
    }

    public abstract double calcularDano();

    @Override
    public int compareTo(Personagem p) {
        int comparacaoDano = Double.compare(p.calcularDano(), this.calcularDano());

        if (comparacaoDano != 0) {
            return comparacaoDano;
        }

        return this.nome.compareTo(p.nome);
    }
}