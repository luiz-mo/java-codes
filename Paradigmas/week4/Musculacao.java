public class Musculacao extends ModalidadeFitness{
    private float qtdPeso;

    Musculacao(){}
    
    public float getQtdPeso(){
        return this.qtdPeso;
    }

    public void setQtdPeso(float qtdPeso){
        this.qtdPeso = qtdPeso;
    }

    @Override
    public void exibirDescricao(){
        System.out.println("descricao da musculacao");
    }
}