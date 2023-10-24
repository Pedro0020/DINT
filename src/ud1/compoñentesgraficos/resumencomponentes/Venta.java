/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

/**
 *
 * @author node
 */
public class Venta {
    String Codigo;
    String Fecha;
    String CodCli;
    String CodArt;
    int Cantidad;
    int Precio;
    int Importe;
    

    public Venta(String Codigo, String Fecha, String CodCli, String CodArt, int Cantidad, int Precio) {
        this.Codigo = Codigo;
        this.Fecha = Fecha;
        this.CodCli = CodCli;
        this.CodArt= CodArt;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Importe = Cantidad * Precio;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setCodCli(String CodCli) {
        this.CodCli = CodCli;
    }

    public void setCodArt(String CodArt) {
        this.CodArt = CodArt;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setImporte(int Importe) {
        this.Importe = Importe;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getCodCli() {
        return CodCli;
    }

    public String getCodArt() {
        return CodArt;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getImporte() {
        return Importe;
    }
 

   
  

    @Override
    public String toString() {
        //return "Cliente{" + "Dni=" + Dni + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono + '}';
        return  Codigo  ;
    }
    
    
    
    
}
