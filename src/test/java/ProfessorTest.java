import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetonarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Mestrado");

        Professor professor = new Professor(escolaridade);

        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }
    @Test
    void deveRetornarNaturalidadeProfessor(){
        Cidade naturalidade = new Cidade();
        naturalidade.setNaturalidade("Juiz de Fora");

        Professor prof  = new Professor(naturalidade);

        assertEquals("Juiz de Fora",prof.getNaturalidade());
    }
    @Test
    void deveRetornarTipoDeEnsinoDoProfessor(){
        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        Curso curso = new Curso();

        tipoEnsino.setTipoDeEnsinoProfessor("Ensino Superior");
        curso.setTipoEnsino(tipoEnsino);
        professor.setCurso(curso);

        assertEquals("Ensino Superior", professor.getTipoDeEnsinoProfessor());
    }
    @Test
    void deveRetornarExcecaoProfessorSemTipoDeEnsino(){
        try{
            Professor professor = new Professor();
            Curso curso = new Curso();

            professor.setCurso(curso);
            professor.getTipoDeEnsinoProfessor();
        }
        catch (NullPointerException e){
            assertEquals("Sem tipo de ensino", e.getMessage());
        }
    }




}