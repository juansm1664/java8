package org.juandavid.java8.lambda;

import org.juandavid.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {


        System.out.println("=============Consumer=========");
        Consumer<Date> consumer = fecha ->{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(format.format(fecha));
        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> consumerBi = (nombre, edad)->{
            System.out.println(nombre + " , tiene " + edad +"años");
        };
        consumerBi.accept("Juan David", 23);


        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("hola lambda");

        System.out.println("=============Biconsumer=========");
        List<String> nombres = Arrays.asList("juan", "david", "paola", "felipe");
        nombres.forEach(consumer2);
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = (Usuario::setNombre);
        asignarNombre.accept(usuario,"Juan David");
        System.out.println("nomnbre usuario " + usuario.getNombre());

        System.out.println("=============Supplier=========");
        Supplier<String> proveedor = () ->{

            return "lambda supplier";
        };
        System.out.println(proveedor.get());
    }
}
