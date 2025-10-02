package com.basquete.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteFactoryTest {

    @Test
    void deveRetornarExcecaoParaTesteInexistente() {
        try {
            ITeste teste = TesteFactory.obterTeste("Rebote");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Teste inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTesteInvalido() {
        try {
            ITeste teste = TesteFactory.obterTeste("Invalido");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Teste inválido", e.getMessage());
        }
    }
}
