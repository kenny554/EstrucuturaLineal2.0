package Materia.ListasEnlazadas;

public class ListaEnlazadasGenericas<T> {
    public Node<T> head;
    private int tamanio = 0;

    public ListaEnlazadasGenericas() {

    }

    class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    // Agregar Nodos a las lista
    public void addNode(T value) {
        if (head == null) {
            head = new Node<>(value);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
            tamanio++;
        }
        current.next = new Node<>(value);
    }

    // Metodo para eliminar
    public void deleteNode(T value) {
        if (head == null) {
            return;
        } // no hay elementos no hace nada
        if (head.value.equals(value)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.value.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int size() {
        return tamanio;
    }

    public void print() {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            System.out.println("Node-> " + current.value);
            current = current.next;
        }
        System.out.println("Node-> " + current.value);
        System.out.println("Fin de la Lista");
        System.out.println("El tamaño es " + tamanio);
    }

}
