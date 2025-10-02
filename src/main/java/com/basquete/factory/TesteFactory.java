package com.basquete.factory;

public class TesteFactory {

    public static ITeste obterTeste(String teste) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("com.basquete.factory.Teste" + teste);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Teste inexistente");
        }
        if (!(objeto instanceof ITeste)) {
            throw new IllegalArgumentException("Teste inválido");
        }
        return (ITeste) objeto;
    }
}
