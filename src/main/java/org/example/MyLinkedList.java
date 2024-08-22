package org.example;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {


        class Empleado {
            private String nombre;
            private int edad;
            private double salario;

            public Empleado(String nombre, int edad, double salario) {
                this.nombre = nombre;
                this.edad = edad;
                this.salario = salario;
            }

            public String dameDatos() {
                return "El empleado se llama " + nombre + ". Tiene " + edad + " años. Y un salario de " + salario;
            }
        }
    }
}