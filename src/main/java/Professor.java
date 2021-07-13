public class Professor extends Pessoa {

    private Curso contratacao;

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public Professor(Curso contratacao){
        this.contratacao = contratacao;
    }

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }
    public Professor(Cidade naturalidade) {
        super(naturalidade);
    }

    public String getTipoEnsinoProfessor(){
        return contratacao.getTipoEnsino;
    }


}
