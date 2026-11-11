public abstract class Produto{
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    abstract double calcularPrecoFinal();

    abstract String getCategoria();
}