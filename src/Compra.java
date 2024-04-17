public class Compra {

    //Atributos
    private String producto;
    private int valor;

    //Constructor
    public Compra(String producto, int valor) {
        this.producto = producto;
        this.valor = valor;
    }

    //GyS
    public String getProducto() {
        return producto;
    }

    public int getValor() {
        return valor;
    }
}
