package com.basquete.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteDefesaTest {

    @Test
    void deveExecutarTesteDefesa() {
        ITeste teste = TesteFactory.obterTeste("Defesa");
        assertEquals("Teste de defesa executado", teste.executar());
    }

    @Test
    void deveCancelarTesteDefesa() {
        ITeste teste = TesteFactory.obterTeste("Defesa");
        assertEquals("Teste de defesa cancelado", teste.cancelar());
    }
}
