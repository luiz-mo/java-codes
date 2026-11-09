public class Livro{
    private String titulo;
    private String anoPublicacao;
    private Autor autor;

    public Livro(){};

    public String getTitulo(){
        return this.titulo;
    }

    public String getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnoPublicacao(){
        this.anoPublicacao = anoPublicacao;
    }
}