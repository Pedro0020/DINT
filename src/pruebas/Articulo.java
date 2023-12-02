/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import ud1.*;

/**
 *
 * @author node
 */
public class Articulo {
    String Codigo;
    String Articulo;
    String Unidad;
    int Cantidad;
    int Precio;
    int Importe;
    

    public Articulo(String Codigo, String Articulo, String Unidad, int Cantidad, int Precio) {
        this.Codigo = Codigo;
        this.Articulo = Articulo;
        this.Unidad = Unidad;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Importe = Cantidad * Precio;
    }

    public int getImporte() {
        return Importe;
    }

    public void setImporte(int Importe) {
        this.Importe = Importe;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getArticulo() {
        return Articulo;
    }

    public String getUnidad() {
        return Unidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

   
  

    @Override
    public String toString() {
        //return "Cliente{" + "Dni=" + Dni + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono + '}';
        return  Codigo + " : "  + Articulo ;
    }
    
    
    
    
}
