package main;

import java.util.*;

public class LogicaClasificacion {

    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        while (!cola.isEmpty()) {
            pila.push(cola.poll());
        }

        Queue<String> inv = new LinkedList<>();
        while (!pila.isEmpty()) {
            inv.add(pila.pop());
        }

        return inv;
    }

    public boolean verificarPalindromoCola(Queue<String> cola) {
        List<String> lista = new ArrayList<>(cola);
        int izq = 0;
        int der = lista.size() - 1;

        while (izq < der) {
            if (!lista.get(izq).equals(lista.get(der))) {
                return false;
            }
            izq++;
            der--;
        }
        return true;
    }
}
