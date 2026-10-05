public class Endereco{
    private String nomeRua;
    private int numero;

    public Endereco(){}

    public Endereco(String nomeRua, int numero){
        this.setNomeRua(nomeRua);
        this.setNumero(numero);
    }

    public void setNomeRua(String nomeRua){
        this.nomeRua = nomeRua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNomeRua(){
        return this.nomeRua;
    }

    public int getNumero(){
        return this.numero;
    }
}