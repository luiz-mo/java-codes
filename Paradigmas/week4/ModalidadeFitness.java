public abstract class ModalidadeFitness extends ModalidadeEsportiva{
    protected Horario duracao;

    public Horario getDuracao(){
        return this.duracao;
    }

    public void setDuracao(Horario duracao){
        this.duracao = duracao;
    }
}