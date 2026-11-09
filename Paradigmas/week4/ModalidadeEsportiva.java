public abstract class ModalidadeEsportiva{
    protected String objetivo;
    protected String regra;

    public String getObjetivo(){
        return this.objetivo;
    }

    public String getRegra(){
        return this.regra;
    }

    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }

    public void setRegra(String regra){
        this.regra = regra;
    }

    public abstract void exibirDescricao();
}