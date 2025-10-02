package com.basquete.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteArremessoTest {

    @Test
    void deveExecutarTesteArremesso() {
        ITeste teste = TesteFactory.obterTeste("Arremesso");
        assertEquals("Teste de arremesso executado", teste.executar());
    }

    @Test
    void deveCancelarTesteArremesso() {
        ITeste teste = TesteFactory.obterTeste("Arremesso");
        assertEquals("Teste de arremesso cancelado", teste.cancelar());
    }
}
