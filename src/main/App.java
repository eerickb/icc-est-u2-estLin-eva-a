package main;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion logica = new LogicaClasificacion();

        Queue<String> colaNombres = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        System.out.println("\nCola original: " + colaNombres);
        Queue<String> invertida = logica.invertirColaNombres(new LinkedList<>(colaNombres));
        System.out.println("Cola invertida: " + invertida);

        Queue<String> palindromo = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        Queue<String> noPalindromo = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));

        System.out.println("\n¿Radar es palindromo? " + logica.verificarPalindromoCola(palindromo));
        System.out.println("¿Casa es palindromo? " + logica.verificarPalindromoCola(noPalindromo));
    }
}
