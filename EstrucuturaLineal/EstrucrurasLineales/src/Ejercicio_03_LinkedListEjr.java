import Materia.Models.Node;

public class Ejercicio_03_LinkedListEjr {

    public Node head;
    private int tamanio = 0;

    // Agrgar Nodos a las lista
    public void allNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;

        }
        Node curret = head;
        while (curret.next != null) {
            curret = curret.next;
            tamanio++;

        }
        curret.next = new Node(value);
    }

    /// Metodo para eliminar

    public void deleteNode(int value) {
        if (head == null) {
            return;
        } // no hay elementos no hace nada
        if (head.value == value) {
            head = head.next;
            return;

        }
        Node current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;

            }
            current = current.next;
            tamanio--;

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
        Node current = head;
        while (current.next != null) {
            System.out.println("Node-> " + current.value);
            current = current.next;

        }
        System.out.println("Node-> " + current.value);
        System.out.println("Fin de la Lista");
    }

    // Metodo de encotrar
    public int getByPos(int position) {
        if (head == null || position < 1 || position > tamanio) {
            return -1;
        }
        Node curred = head;
        for (int i = 1; i < position; i++) {
            if (curred.next == null) {
                return -1;
            }
            curred = curred.next;
        }
        return curred.value;
    }

}
