package Modelo;

/**
 *
 * @author Steven
 */
public class ProductoBuilder implements ProductoImplBuilder {
    private final Producto producto;
    
    public ProductoBuilder(){
        this.producto = new Producto();
    }
    
    public int getId(){
        return this.producto.getId();
    }
    
    public String getNombre(){
        return this.producto.getNombre();
    }
    
    public int getCantidad(){
        return this.producto.getCantidad();
    }
    
    public double getPrecio(){
        return this.producto.getPrecio();
    }
    
    @Override
    public ProductoBuilder buildNombre(String nombre){
        this.producto.setNombre(nombre);
        return this;
    }
    
    @Override 
    public ProductoBuilder buildCantidad(int cantidad){
        this.producto.setCantidad(cantidad);
        return this;
    }
    
    @Override  
    public ProductoBuilder buildPrecio(double precio){
        this.producto.setPrecio(precio);
        return this;
    }
    
    @Override
    public Producto build(){
        return this.producto;
    }
}
