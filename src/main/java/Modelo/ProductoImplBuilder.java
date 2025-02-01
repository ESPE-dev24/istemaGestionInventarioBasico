/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author Steven
 */
public interface ProductoImplBuilder {
    ProductoImplBuilder buildNombre(String nombre);
    ProductoImplBuilder buildCantidad(int cantidad);
    ProductoImplBuilder buildPrecio(double precio);
    Producto build();
}
