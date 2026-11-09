public class Spinning extends ModalidadeFitness{
    private int resistencia;

    Spinning(){}

    public int getResistencia(){
        return this.resistencia;
    }

    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }

    @Override
    public void exibirDescricao(){
        System.out.println("descricao do spinning");
    }
}