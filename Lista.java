
public class Lista {

    // Referencia al primer nodo de la lista
    Nodo cabeza;

    // Constructor: inicia la lista vacía
    public Lista() {
        cabeza = null;
    }

    // Inserta un nuevo nodo al final de la lista
    public void insertarAlFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo será la cabeza
        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            // Recorre la lista hasta llegar al último nodo
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            // Conecta el último nodo con el nuevo nodo
            actual.siguiente = nuevo;
        }
    }

    // Muestra todos los elementos de la lista
    public void mostrarLista() {

        Nodo actual = cabeza;

        // Recorre los nodos hasta llegar al final
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("NULL");
    }

    // Busca un dato dentro de la lista
    public boolean buscar(int datoBuscado) {

        Nodo actual = cabeza;

        // Compara el dato buscado con cada nodo
        while (actual != null) {

            if (actual.dato == datoBuscado) {
                return true;
            }

            actual = actual.siguiente;
        }

        // Retorna false si el dato no se encuentra
        return false;
    }

    // Elimina un nodo según el dato indicado
    public boolean eliminar(int datoEliminar) {

        // Verifica si la lista está vacía
        if (cabeza == null) {
            return false;
        }

        // Caso 1: eliminar el primer nodo
        if (cabeza.dato == datoEliminar) {
            cabeza = cabeza.siguiente;
            return true;
        }

        // Recorre la lista buscando el nodo que se eliminará
        Nodo actual = cabeza;

        while (actual.siguiente != null) {

            // Si encuentra el dato, desconecta el nodo
            if (actual.siguiente.dato == datoEliminar) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }

            actual = actual.siguiente;
        }

        // Retorna false si el dato no existe
        return false;
    }
}
