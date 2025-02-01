package Controlador;
import Modelo.GestionInventario;
import Vista.VistaProductos;
import Vista.Vista;
import Modelo.Producto;
import java.util.List;


/**
 *
 * @author Steven
 */
public class InventarioController {
    private GestionInventario inventario;
    private VistaProductos vista_productos;
    private Vista vista;

    public InventarioController(GestionInventario inventario,VistaProductos vista_productos,Vista vista) {
        this.inventario = inventario;
        this.vista_productos = vista_productos;
        this.vista = vista;
    }
    
    public void iniciar(){
        
    }
    public void eliminarProducto(){
        int id_producto = vista_productos.solicitar_id_producto();
        inventario.eliminarProducto(id_producto);
    }
    public void agregarProducto(){
        Producto nuevoProducto = vista_productos.solicitar_producto();
        inventario.agregarProducto(nuevoProducto);
        vista_productos.mostrar_msg("Producto agregado Exitosamente!");
    }
    
    public void listarProductos(){
        vista_productos.mostrar_lista_productos(this.inventario.listarProductos());
    }
    
    public void buscarProducto(){
        int id_producto = vista_productos.solicitar_id_producto();
        Producto producto_buscado = inventario.buscarProductoById(id_producto);
        vista_productos.mostrar_producto(producto_buscado);
    }
    
    public void actualizar(){
        int id_producto = vista.solicitarEntradaInt("Ingrese el Id del Producto a modificar");
        Producto actualizado_producto = vista_productos.solicitar_producto();
        Producto producto_actualizado = inventario.actualizar(id_producto, actualizado_producto);
        producto_actualizado.setId(actualizado_producto.getId());
        inventario.agregarProducto(producto_actualizado);
        vista_productos.mostrar_producto(producto_actualizado);
    }
    
    public void calcular_total_inventario(){
        List<Producto> productos = this.inventario.listarProductos();
        int total_productos = 0;
        double total_valor_economico = 0.00;
        
        for (Producto producto : productos){
            total_productos += producto.getCantidad();
            total_valor_economico += producto.getCantidad() * producto.getPrecio();
        }
        vista.mostrarMensaje("\n===== TOTAL PRODUCTOS INVENTARIO =====\n");
        vista.mostrarMensaje(Integer.toString(total_productos));
        vista.mostrarMensaje("\n===== TOTAL VALOR ECONOMICO DE RETORNO =====\n");
        vista.mostrarMensaje(Double.toString(total_valor_economico));
    }
}
