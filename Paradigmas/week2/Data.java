public class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimirData(){
        System.out.printf("%d/%d/%d", this.dia, this.mes, this.ano);
    }

    public int retornarAno(){
        return this.ano;
    }
}