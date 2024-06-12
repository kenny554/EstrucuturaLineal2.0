public class Mainejercici3 {
    public static void main(String[] args) {

        Ejercicio_03_LinkedListEjr lis = new Ejercicio_03_LinkedListEjr();
        lis.allNode(6);
        lis.allNode(1);
        lis.allNode(2);
        lis.allNode(7);
        lis.allNode(5);
        lis.print();
        System.out.println("La posicion es:" + lis.getByPos(4));
    }

}
