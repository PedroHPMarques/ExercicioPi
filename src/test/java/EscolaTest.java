import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EscolaTest {
    @Test
    void deveRetonarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");

        Professor professor = new Professor(escolaridade);
        Escola escola = new Escola(professor);

        assertEquals("Doutorado", escola.getDescricaoEscolaridadeDiretor());
    }


}