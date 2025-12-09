package ui;

import data.GestorUnidades;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA SALMONTT ===");

        GestorUnidades gestor = new GestorUnidades();

        System.out.println("\n=== MOSTRANDO UNIDADES OPERATIVAS ===");
        gestor.mostrarUnidades();

        System.out.println("\n=== LISTA COMPLETA (toString) ===");
        for (var u : gestor.getUnidades()) {
            System.out.println(u);
        }
    }
}
