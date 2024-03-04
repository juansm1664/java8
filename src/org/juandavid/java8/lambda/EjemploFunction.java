package org.juandavid.java8.lambda;

import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<String,String> function = parm -> "hola que tal soy " + parm;
        String resultado = function.apply("Juan David");

        System.out.println(resultado);
    }
}
