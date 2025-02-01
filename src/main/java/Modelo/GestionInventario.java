package Modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Steven
 */
public class GestionInventario {
    private final List<Producto> productos;
    private final ProductoBuilder productoBuilder;
    
    public GestionInventario(){
        this.productos = new ArrayList<>();
        this.productoBuilder = new ProductoBuilder();
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public Producto buscarProductoById(int id){
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    
    public void eliminarProducto(int id){
        productos.removeIf(p -> p.getId() == id);
    }
    
    
    public List<Producto> listarProductos(){
        return this.productos;
    }
    
    public int cantidadProductos(){
        return 0;
    }
    
    public Producto actualizar(int id,Producto producto_actualizado){
        Producto productoExistente = buscarProductoById(id);
        
        if (productoExistente != null ){
            System.out.println("Existe Producto");
            ProductoBuilder productoActualizado = this.productoBuilder
                    .buildNombre(producto_actualizado.getNombre() != null ? producto_actualizado.getNombre() : productoExistente.getNombre())
                    .buildCantidad(producto_actualizado.getCantidad() > 0 ? producto_actualizado.getCantidad() : productoExistente.getCantidad())
                    .buildPrecio(producto_actualizado.getPrecio() > 0 ? producto_actualizado.getPrecio() : productoExistente.getPrecio());
            this.eliminarProducto(id);
            
            return productoActualizado.build();
        }
        
        return null;
    }
}
