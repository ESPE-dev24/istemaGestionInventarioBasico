package org.examples.gestioninventariomvc;
import Vista.VistaProductos;
import Vista.Vista;
import Controlador.InventarioController;
import Modelo.GestionInventario;

public class GestionInventarioMVC {
    VistaProductos vista_producto;
    Vista vista;
    GestionInventario gestion_inventario;

    InventarioController inventario;

    public static void main(String[] args) {

        GestionInventario gestion_inventario = new GestionInventario();
        VistaProductos vista_producto = new VistaProductos();
        Vista vista = new Vista();
        InventarioController inventario = new InventarioController(gestion_inventario, vista_producto, vista);
        boolean inicio = true;

        while(inicio){
            int mostrar_menu_text = vista_producto.mostar_menu();
            if(mostrar_menu_text  > 7 || mostrar_menu_text < 1 ){
                System.out.println("Gracias por Visitar nuestro Sistema");
                inicio = false;
            }
            
            if(1 == mostrar_menu_text){
                inventario.agregarProducto();
                inventario.listarProductos();
            }
            if(2 == mostrar_menu_text){
                inventario.listarProductos();
            }
            if(3 == mostrar_menu_text){
                inventario.buscarProducto();
            }
            if(4 == mostrar_menu_text){
                inventario.actualizar();
            }
            if(5 == mostrar_menu_text){
                inventario.eliminarProducto();
            }
            if(6 == mostrar_menu_text){
                inventario.calcular_total_inventario();
            }
            if(7 == mostrar_menu_text){
                System.out.println("Gracias por Visitar nuestro Sistema");
                inicio = false;
            }
        }
    }
}

