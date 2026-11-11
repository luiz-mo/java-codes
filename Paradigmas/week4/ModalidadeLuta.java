public abstract class ModalidadeLuta extends ModalidadeEsportiva{
    protected String[] equipamentosDeLuta;
    protected String[] vestuarioDeLuta;
    protected String estrategia;
    protected String tipoLuta;

    ModalidadeLuta(){};

    public String[] getEquipamentosDeLuta(){
        return this.equipamentosDeLuta;
    }

    public String[] getVestuarioDeLuta(){
        return this.vestuarioDeLuta;
    }

    public String getEstrategia(){
        return this.estrategia;
    }

    public String getTipoLuta(){
        return this.tipoLuta;
    }

    public void setEquipamentosDeLuta(String[] equipamentosDeLuta){
        this.equipamentosDeLuta = equipamentosDeLuta;
    }

    public void setVestuarioDeLuta(String[] vestuarioDeLuta){
        this.vestuarioDeLuta = vestuarioDeLuta;
    }

    public void setEstrategia(String estrategia){
        this.estrategia = estrategia;
    }

    public void setTipoLuta(String tipoLuta){
         this.tipoLuta = tipoLuta;
    }
}