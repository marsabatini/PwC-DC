package main.Desafio_02;

/**
 * DESAFIO 02
 *
 * O programa abaixo remove todos os caracteres repetidos de uma
 * string qualquer a partir de sua primeira repetição.
 *
 ***** Exemplo:
 ***** -> Input: Hello, World! Hello, PwC!
 ***** -> Output: Helo, Wrd! PC
 *
 * @autor: Marco Sabatini
 * @version: 1.01
 * @since: 08/07/2023
 **/

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String strExemplo = "Hello, World! Hello, PwC!";
        String fraseUser;

        Scanner enter = new Scanner(System.in);

        System.out.println("DESAFIO 02");
        System.out.println("Remoção de caracteres repetidos.\n");
        System.out.println("---------------------\n");
        System.out.print("Digite 1 para ver o exemplo ou digite sua frase: ");

        fraseUser = enter.nextLine();


        if (fraseUser.equals("1")) {
            System.out.println("-> Input: " + strExemplo);
            removeStrRepetida(strExemplo);
            System.out.println();

        } else {
            System.out.println("-> Input: " + fraseUser);
            removeStrRepetida(fraseUser);
            System.out.println();
        }

        enter.close();
    }

    /*
     *   Comumente, cria-se loops para percorrer uma String caracter por
     *   caractar e, assim, manipulá-los com Arrays e outras classes.
     *
     *   No entanto, não podemos esquecer que, conceitualmente, uma String
     *   é, antes de tudo, uma cadeia de caracteres, ou melhor, um array.
     *   Desse modo, a própria classe String (pelo menos, a partir do Java
     *   8) possui métodos que podem facilitar e aprimorar a utilização
     *   desse recurso, sobretudo quando diretamente com Streams.
     *
     *   Logo, para apresentar cada caracter, por exemplo, o loop for
     *   poderia ser substituído facilmente por:
     *      strVariavel.chars().mapToObj(c -> (char) c).toList().forEach(System.out::println);
     *
     */

    public static void removeStrRepetida(String strOriginal) {

        System.out.print("\t--> RESULTADO: ");

        // Note que o espaço também é um tipo char; logo, no limite, também
        // é um caracter; por isso, após sua primeira ocorrência, ele tam-
        // bém será omitido.
        strOriginal
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(System.out::print);

    }
}
