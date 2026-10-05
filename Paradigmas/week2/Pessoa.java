public class Pessoa{
    private String nome;
    private int idade;
    private Data dataNascimento;

    public Pessoa(String nome, int dia, int mes, int ano){
        this.nome = nome;
        this.dataNascimento = new Data(dia, mes, ano);
    }

    public String retornarNome(){
        return this.nome;
    }

    public int retornarIdade(){
        return this.idade;
    }

    public void calcularIdade(int dia, int mes, int ano){
        this.idade = ano - this.dataNascimento.retornarAno();
        
    }
}
