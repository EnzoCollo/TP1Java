package src.articulos;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private String codigo;
    private Date fecha;
    private List items = new ArrayList<>();
    public Pedido(String codigo) {
        this.codigo = codigo;
        this.fecha = new Date();
    }
    public void agregarItems(String nombre, int cantidad, float precio){
        items.add(new Item(nombre, precio, cantidad));
    }
    public float calcularTotal(){
        float total = 0;
        for(Object item : items) {
            Item i = (Item) item;
            total += i.getPrecio() * i.getCantidad();
        }
    }
}
