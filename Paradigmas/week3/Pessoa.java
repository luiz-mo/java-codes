public class Pessoa{
    private String nome;
    private String ocupacao;
    private Endereco endereco;
    private Data dataNasc;

    public Pessoa(){}

    public Pessoa(String nome, String ocupacao, Endereco endereco, Data dataNasc){
        this.setNome(nome);
        this.setOcupacao(ocupacao);
        this.setEndereco(endereco);
        this.setDataNasc(dataNasc);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setOcupacao(String ocupacao){
        this.ocupacao = ocupacao;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataNasc(Data dataNasc){
        this.dataNasc = dataNasc;
    }

    public String getNome(){
        return this.nome;
    }

    public String getOcupacao(){
        return this.ocupacao;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ocupacao: " + this.getOcupacao());
        System.out.println("Endereco: " + this.endereco.getNomeRua() + ", " + this.endereco.getNumero());
        System.out.println("Data de Nascimento: " + this.dataNasc.getDia() + "/" + this.dataNasc.getMes() + "/" + this.dataNasc.getAno());
    }
}