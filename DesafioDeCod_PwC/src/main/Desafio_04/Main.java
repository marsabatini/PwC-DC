package main.Desafio_04;

/**
 * DESAFIO 04
 * <p>
 * Torna maiúscula a primeira letra de cada frase.
 * <p>
 * *** Exemplo:
 * *** -> Input: hello. how are you? i'm fine, thank you.
 * *** -> Output: Hello. How are you? I'm fine, thank you.
 *
 * @autor: Marco Sabatini
 * @version: 1.01
 * @since: 08/07/2023
 **/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String strExemplo01 = "hello. how are you? i'm fine, thank you.";
        String strExemplo02 = "uauuu! o Marco Sabatini mandou muito bem. ele não merece uma vaga?";
        String strUser;
        int escolha = 1;

        Scanner enter = new Scanner(System.in);

        System.out.println("DESAFIO 04");
        System.out.println("Tornando maiúsculas.\n");

        while(escolha != 0) {
            System.out.println("---------------------\n");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("\tDigite 1 para o primeiro exemplo.");
            System.out.println("\tDigite 2 para o segundo exemplo.");
            System.out.println("\tDigite 3 para o entrar com sua frase.");
            System.out.println("\tDigite 0 para sair.");
            System.out.print("\nOpção: ");


            escolha = enter.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("-> Input: " + strExemplo01);
                    tornaMaiuscula(strExemplo01);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("-> Input: " + strExemplo02);
                    tornaMaiuscula(strExemplo02);
                    System.out.println();
                    break;

                case 3:
                    enter.nextLine();
                    System.out.print("\n\tDigite sua frase: ");
                    strUser = enter.nextLine();
                    System.out.println("-> Input: " + strUser);
                    tornaMaiuscula(strUser);
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Tente novamente.");
                    break;
            }
        }


    }

    public static void tornaMaiuscula(String str){

        String strFinal = "";

        ArrayList<Integer> index = new ArrayList<>();

        /*
            Note dois pontos importantes.

            PRIMEIRO: no português, toda frase é finalizada com um ponto, uma interroga-
            ção ou uma exclamação. Isso significa que precisamos apenas identificar esse
            padrão nas frases e, após descobrir seu índice, tornar maiúsculo o próximo
            caracter.

            SEGUNDO: o tipo char é, no limite, um valor inteiro, conforme a tabela ASCII.
            Isso significa que podemos identificá-los por meio de seus códigos respec-
            tivos. Claro, isso é mais para exercício do que para o cotidiano.
         */
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 46 || str.charAt(i) == 3 || str.charAt(i) == 63) {
                index.add(i);
            }
        }


        StringBuilder stringBuilder = new StringBuilder(str);

        for(int j = 0; j < index.size(); j++){

            int ind = index.get(j) + 2;

            if(j == 0){
                stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
                String textoFinal = stringBuilder.toString();

                strFinal = textoFinal;
            }

            if(ind < strFinal.length()){
                stringBuilder.setCharAt(ind, Character.toUpperCase(stringBuilder.charAt(ind)));
                String textoFinal = stringBuilder.toString();

                strFinal = textoFinal;
            }
        }

        System.out.println("RESULTADO: " + strFinal + "\n");
    }
}

