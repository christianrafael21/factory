package com.basquete.factory;

public class TesteArremesso implements ITeste {

    public String executar() {
        return "Teste de arremesso executado";
    }

    public String cancelar() {
        return "Teste de arremesso cancelado";
    }
}
