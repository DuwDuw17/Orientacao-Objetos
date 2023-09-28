package Lista1.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    FuncionarioComum funcionario;

    @BeforeEach
    void setUp(){
        funcionario = new FuncionarioComum();
    }

    @Test
    void deveRetornarSalarioFuncionarioComum(){
        funcionario.setSalarioMensal(1000.0f);
        assertEquals(1000.0f, funcionario.calcularPagamento());
    }

}