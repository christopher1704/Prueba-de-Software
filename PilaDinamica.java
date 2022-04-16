public class PilaDinamica<String> {
 
    //Atributos
    private Nodo<String> top; //Ultimo nodo que se ha incluido
    private int size;
 
    //Constructores
    public PilaDinamica() {
        top = null; //No hay elementos
        this.size = 0;
    }
 
    //Indica si esta vacia o no
    public boolean isEmpty() {
        return top == null;
    }
 
    //Indica el tamaño
    public int size() {
        return this.size;
    }
 
    //Devuelve el que esta más arriba en la pila
    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }
 
    //Saca y devuelve el elemento que esta mas arriba esta en la pila
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String elemento = top.getElemento();
            Nodo<String> aux = top.getSiguiente();
            top = null; 
            top = aux; //actualizo el top
            this.size--;
            return elemento;
        }
    }
 
    //Mete un elemento a la pila
    public String push(String elemento) {

        Nodo<String> aux = new Nodo<>(elemento, top);  // pasas el top debido a que sera el nuevo siguiente del nuevo nodo
        top = aux; //actualizo el top
        this.size++;
        return aux.getElemento();
    }
 
    //Devuelve el estado de la pila
    public void Show() {
 
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
 
            String resultado;
            Nodo<String> aux = top;
            //Recorro la pila
            int sizeaux = this.size;
            while (aux != null) {
                resultado = aux.getElemento();
                System.out.println(resultado + " [" + sizeaux + "]");
                aux = aux.getSiguiente();
                sizeaux--;
            }
 
            //return resultado;
            return;
 
        }
 
    }
 
}