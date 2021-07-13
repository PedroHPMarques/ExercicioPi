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



}