/*@Alexis Guaman */

import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.ListasEnlazadas.ListaEnlazadasGenericas;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Pila pilita = new Pila();
        // pilita.push(10);
        // pilita.push(20);
        // pilita.push(30);
        // pilita.push(40);

        // System.out.println("Elemento en la cima de la fila es:" + pilita.peek());
        // System.out.println("Elemento eliminado de la fila es:" + pilita.pop());
        // System.out.println("Elemento en la cima de la fila es:" + pilita.peek());
        // System.out.println("");

        // // Implementacion de fila generica
        // PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
        // pilaPantalla.push(new Pantalla("Home Page", "/home"));
        // pilaPantalla.push(new Pantalla("Home Page", "/home/menu"));
        // pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/settings"));

        // System.out.println("Estoy en la pantalla:\n\t-->" +
        // pilaPantalla.peek().getNombre());
        // System.out.println("Destruir pantalla:\n\t-->" +
        // pilaPantalla.pop().getNombre());
        // System.out.println("Estoy en la pantalla:\n\t-->" +
        // pilaPantalla.peek().getNombre());
        // pilaPantalla.push(new Pantalla("User Page", "/home/menu/settings"));
        // System.out.println("Estoy en la pantalla:\n\t-->" +
        // pilaPantalla.peek().getNombre());

        // System.out.println("");

        // // IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        // Cola queue = new Cola();
        // queue.addNode(10);
        // queue.addNode(20);
        // queue.addNode(30);

        // // Mostrar elemento de frente
        // System.out.println("El elemento del frente es:-->" + queue.peek());// 10

        // // Retirar elementos de la cola
        // System.out.println("Elemento retirado:-->" + queue.remove());// 10
        // System.out.println("Elemento del frente-->:" + queue.peek());// 10

        // System.out.println("Elemento retirado:-->" + queue.remove());// 20
        // System.out.println("Elemento del frente es:-->" + queue.peek());// 30

        // // Verificar si la cola esta vacia
        // System.out.println("Cola vacia ? --> " + (queue.isEmpty() ? "Si" : "No"));//
        // false
        // System.out.println("La cola tiene " + queue.size() + " Numero de elementos");

        // // IMPLEMENTACION COLA GENERICA
        // ColaGenerica<Pantalla> quColaGenerica = new ColaGenerica<>();
        // quColaGenerica.allNode(new Pantalla("Home Page", "Home "));
        // quColaGenerica.allNode(new Pantalla("Menu Pege", "Home/Menu"));
        // quColaGenerica.allNode(new Pantalla("Settings Page", "/home/menu/settings"));

        // System.out.println("Estoy en la pantalla \n\t--->" +
        // quColaGenerica.peek().getNombre());
        // System.out.println("Pantalla destruida \n\t--->" +
        // quColaGenerica.remove().getNombre());
        // quColaGenerica.allNode(new Pantalla("User Page", "User
        // page/home/menu/settings"));
        // System.out.println("Estoy en la pantalla\n\t--->" +
        // quColaGenerica.peek().getNombre());
        // System.out.println("Pantalla destruida\n \t--->" +
        // quColaGenerica.remove().getNombre());
        // System.out.println("Pantalla destruida \n\t--->" +
        // quColaGenerica.remove().getNombre());
        // System.out.println("Estoy en la pantalla\n \t--->" +
        // quColaGenerica.peek().getNombre());
        // System.out.println("La cola tiene " + quColaGenerica.size() + " Numero de
        // elementos" + "Elemetos");
        ListaEnlazada lista = new ListaEnlazada();
        lista.allNode(1);
        lista.allNode(4);
        lista.allNode(3);
        lista.allNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();
        lista.size();
        System.out.println("El tamanio es" + lista.size());

        // lISTA GENERICA
        ListaEnlazadasGenericas<Integer> lista1 = new ListaEnlazadasGenericas<>();

        // Agregar nodos a la lista
        lista1.addNode(10);
        lista1.addNode(20);
        lista1.addNode(30);
        lista1.addNode(40);

        // Imprimir la lista
        lista.print();

        // Eliminar un nodo de la lista
        lista.deleteNode(20);

        // Imprimir la lista después de eliminar un nodo
        lista.print();

        // Imprimir el tamaño de la lista
        System.out.println("El tamaño de la lista es: " + lista1.size());
    }
}
