package src.articulos;

public class Item {
    private String nombre;
    private float precio;
    private int cantidad;
    public Item(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public float getPrecio() {
        return precio;
    }

}
