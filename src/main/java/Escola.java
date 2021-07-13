public class Escola {
    private Professor diretor;

    public Escola(Professor diretor){
        this.diretor = diretor;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getDescricaoEscolaridadeDiretor() {
        return diretor.getDescricaoEscolaridade();
    }
}
