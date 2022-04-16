public class Nodo<String> {
 
    //Atributos
    private String elemento;
    private Nodo<String> siguiente; //Apunta al siguiente nodo
 
    //Contructor
    public Nodo(String elemento, Nodo<String> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
 
    //Metodos
    public String getElemento() {
        return elemento;
    }
 
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
 
    public Nodo<String> getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Nodo<String> siguiente) {
        this.siguiente = siguiente;
    }

 
}