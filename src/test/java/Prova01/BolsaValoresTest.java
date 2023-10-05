package Prova01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaValoresTest {
    BolsaValores conta;

    @BeforeEach
    void setUp(){
        conta = new BolsaValores();
    }

    @Test
    void deveRetornarBolsaValoresValorAdicionalInvalido(){
        try{
            conta.setValorAdicional(-1.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Valor Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarBolsaValoresSaldoInvalido(){
        try{
            conta.setSaldo(-1.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Saldo Inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarResgatarBolsaValoresSaldoInsuficiente(){
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
    void deveResgatar(){
        conta.setSaldo(100.0f);
        conta.setValorRetirada(99.9f);
        assertEquals(99.9f, conta.resgatar());
    }

    @Test
    void deveInvestir(){
        conta.setValorAdicional(100.0f);
        conta.investir();
        assertEquals(50.0f, conta.getSaldo());
    }

}