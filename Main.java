
public class Main {

    public static void main(String[] args) {

        // Crear una nueva lista simplemente enlazada
        Lista lista = new Lista();

        // 1. Insertar elementos
        System.out.println("===== INSERCION DE NODOS =====");

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);

        System.out.println("Nodos insertados correctamente.");
        System.out.print("Lista actual: ");
        lista.mostrarLista();

        // 2. Buscar elementos
        System.out.println("\n===== BUSQUEDA DE NODOS =====");

        System.out.println("¿Esta el numero 20? " + lista.buscar(20));
        System.out.println("¿Esta el numero 50? " + lista.buscar(50));

        // 3. Eliminar un nodo del medio
        System.out.println("\n===== ELIMINACION DE NODOS =====");

        System.out.println("¿Se elimino el 20? " + lista.eliminar(20));
        System.out.print("Lista despues de eliminar 20: ");
        lista.mostrarLista();

        // 4. Eliminar el primer nodo
        System.out.println("\n¿Se elimino el 10? " + lista.eliminar(10));
        System.out.print("Lista despues de eliminar 10: ");
        lista.mostrarLista();

        // 5. Intentar eliminar un dato que no existe
        System.out.println("\n¿Se elimino el 50? " + lista.eliminar(50));
        System.out.print("Lista despues del intento: ");
        lista.mostrarLista();

        // 6. Eliminar el ultimo nodo
        System.out.println("\n¿Se elimino el 30? " + lista.eliminar(30));
        System.out.print("Lista despues de eliminar 30: ");
        lista.mostrarLista();

        // 7. Comprobar que la lista quede vacia
        System.out.println("\n===== ESTADO FINAL =====");
        System.out.print("Lista final: ");
        lista.mostrarLista();
        // 8. Intentar eliminar un elemento de una lista vacia
System.out.println("\n===== PRUEBA DE LISTA VACIA =====");
System.out.println("¿Se elimino el 10? " + lista.eliminar(10));
lista.mostrarLista();
    }
}