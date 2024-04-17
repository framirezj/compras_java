import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {

    //Atributos
    private int cupoDisponible;
    private int saldo;
    private List<Compra> listaDeCompra;

    //Constructor
    public TarjetaDeCredito(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
        this.saldo = cupoDisponible;
        this.listaDeCompra = new ArrayList<>();
    }

    //Metodo para autorizar
    public boolean autoriza(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    //GyS
    public int getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }
}
