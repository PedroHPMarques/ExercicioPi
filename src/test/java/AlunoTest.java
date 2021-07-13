import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    void deveRetornarNaturalidadeAluno(){
        Cidade naturalidade = new Cidade();
        naturalidade.setNaturalidade("Juiz de Fora");

        Aluno aluno  = new Aluno(naturalidade);

        assertEquals("Juiz de Fora",aluno.getNaturalidade());
    }


}