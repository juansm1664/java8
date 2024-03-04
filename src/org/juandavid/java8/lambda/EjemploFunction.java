package org.juandavid.java8.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<String,String> function = parm -> "hola que tal soy " + parm;
        String resultado = function.apply("Juan David");

        System.out.println(resultado);

        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("Pedro pascal"));


        BiFunction<String, String, String> biFunction = (a,b)-> a.toUpperCase().concat(b.toUpperCase());

        String r2 = biFunction.apply("paola", " andrea");

        System.out.println(r2);

        BiFunction<String, String, Integer> biFunction2 = String::compareTo;
        System.out.println(biFunction2.apply("laura", "laura"));

        BiFunction<String, String, String> biFunction3 = String::concat;
        System.out.println(biFunction3.apply("santiago", " jose"));
    }
}
