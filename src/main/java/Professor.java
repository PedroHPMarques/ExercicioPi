public class Professor extends Pessoa {

    private Curso contratacao;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }
    public Professor(Cidade naturalidade) {
        super(naturalidade);
    }
    public String getTipoDeEnsinoProfessor(){
        if (curso.getTipoEnsino() == null){
            throw new NullPointerException("Sem tipo de ensino");
        }
        return curso.getTipoEnsino().getTipoDeEnsinoProfessor();
    }


}
