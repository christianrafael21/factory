package com.basquete.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteDribleTest {

    @Test
    void deveExecutarTesteDrible() {
        ITeste teste = TesteFactory.obterTeste("Drible");
        assertEquals("Teste de drible executado", teste.executar());
    }

    @Test
    void deveCancelarTesteDrible() {
        ITeste teste = TesteFactory.obterTeste("Drible");
        assertEquals("Teste de drible cancelado", teste.cancelar());
    }
}
