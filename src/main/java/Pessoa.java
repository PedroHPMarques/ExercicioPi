public class Pessoa {

    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    public Pessoa(Cidade naturalidade){
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        if (escolaridade != null) {
            this.escolaridade = escolaridade;
        }
    }

    public String getDescricaoEscolaridade() {
        return escolaridade.getDescricao();
    }
    public String getNaturalidade(){
        return naturalidade.getNaturalidade();
    }
}