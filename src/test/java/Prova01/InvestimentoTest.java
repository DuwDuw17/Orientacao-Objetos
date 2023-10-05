package Prova01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {

    Investimento conta;

    @BeforeEach
    void setUp(){
        conta = new Investimento();
    }

    @Test
    void deveRetornarInvestimentoValorAdicionalInvalido(){
        try{
            conta.setValorAdicional(-1.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Valor Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarInvestimentoSaldoInvalido(){
        try{
            conta.setSaldo(-1.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Saldo Inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarResgatarInvestimentoSaldoInsuficiente(){
        try{
            conta.setSaldo(100.0f);
            conta.setValorRetirada(100.1f);
            conta.resgatar();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Saldo Insuficiente",e.getMessage());
        }

    }

    @Test
    void deveResgatarInvestimento(){
        conta.setSaldo(100.0f);
        conta.setValorRetirada(100.0f);
        assertEquals(99.0f, conta.resgatar());
    }

    @Test
    void deveRetornarSaldoAposResgateInvestimento(){
        conta.setSaldo(100.0f);
        conta.setValorRetirada(100.0f);
        conta.resgatar();
        assertEquals(0.0f, conta.getSaldo());
    }

    @Test
    void deveInvestirInvestimento(){
        conta.setValorAdicional(100.0f);
        conta.investir();
        assertEquals(100.0f, conta.getSaldo());
    }

}