package Vista;

import Modelo.Producto;
import java.util.List;
/**
 *
 * @author Steven
 */
public class VistaProductos {
    private final Vista vista;
    
    public VistaProductos(){
        this.vista = new Vista();
    }
    
    public int mostar_menu(){
        vista.mostrarMensaje("\n============ Menu Gestion de Productos =============");
        vista.mostrarMensaje("1. Agregar Producto");
        vista.mostrarMensaje("2. Listar Productos");
        vista.mostrarMensaje("3. Buscar Producto por Id");
        vista.mostrarMensaje("4. Actualizar Producto");
        vista.mostrarMensaje("5. Eliminar Producto");
        vista.mostrarMensaje("6. Mostrar el Total del Inventario");
        vista.mostrarMensaje("7. Salir");
        return vista.solicitarEntradaInt("Seleciona una Opcion");
    }
    
    public Producto solicitar_producto(){
        int id = vista.solicitarEntradaInt("Ingrese el Id");
        String nombre = vista.solicitarEntrada("Ingrese el nombre");
        int cantidad = vista.solicitarEntradaInt("Ingrese la cantidad");
        double precio = vista.solicitarEntradaDouble("Ingrese el precio");
        return new Producto(id, nombre, cantidad, precio);
    }
    
    public int solicitar_id_producto(){
        return vista.solicitarEntradaInt("Ingrese el Id");
    }
    
    public void mostrar_producto(Producto producto){
        if(producto != null){
            vista.mostrarMensaje("\n===== Detalles del Producto =====");
            this.mostrar_msg(producto.toString());
        }else{
            vista.mostrarMensaje("Producto no Encontrado");
        }
    }
    
    public void mostrar_lista_productos(List<Producto> productos ){
        if(productos.isEmpty()){
            vista.mostrarMensaje("Lista de productos vacia");
        }else {
            for(Producto producto:productos){
                vista.mostrarMensaje(producto.toString());
            }
        }
    }

    public void mostrar_msg(String msg){
        vista.mostrarMensaje(msg);
    }
    
}
