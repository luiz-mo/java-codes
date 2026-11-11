public class Monitor{
    private String nome;
    private int matricula;
    private String disciplina;

    public Monitor(){}

    public Monitor(String nome, int matricula, String disciplina){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    @Override
    public String toString(){
        return ("nome " + this.nome + " responsavel pela disciplina de " + this.disciplina);
    }
}