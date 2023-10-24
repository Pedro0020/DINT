/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

/**
 *
 * @author node
 */



import java.util.ArrayList;

public class BD {
    private ArrayList<Cliente> clientes;
    private ArrayList<Articulo> articulos;
    private ArrayList<Venta> ventas;
    private int indiceActual;

    public BD() {
        clientes = new ArrayList<>();
        // Puedes agregar datos iniciales si lo deseas
        clientes.add(new Cliente("111", "Jose Luis", "Marín","986554433"));
        clientes.add(new Cliente("222", "Josefa Luis", "Bueu","33386554433"));
        clientes.add(new Cliente("333", "Jose Luisa", "Marín","44986554433"));
        clientes.add(new Cliente("444", "Josa Luisa", "Bueu","444986554433"));
        clientes.add(new Cliente("555", "Joso Luis", "Marín","95586554433"));
        clientes.add(new Cliente("666", "Josi Luison", "Bueu","55986554433"));
        clientes.add(new Cliente("777", "Jose Luisi", "Marín","96686554433"));
        clientes.add(new Cliente("888", "Jose Luisor", "Bueu","97786554433"));
        clientes.add(new Cliente("999", "Jose Luisar", "Marín","98886554433"));
        
        articulos = new ArrayList<>();
        articulos.add( new Articulo("AA", "TV ACME", "Unidad", 50, 600  ));
        articulos.add( new Articulo("BB", "TABLET ACME", "Unidad", 10, 400  ));
        articulos.add( new Articulo("CC", "Movil ACME", "Unidad", 30, 100  ));
        articulos.add( new Articulo("DD", "Patatas ACME", "Saco", 50, 3  ));
        articulos.add( new Articulo("EE", "Huevos ACME", "Docena", 60, 4  ));
        articulos.add( new Articulo("FF", "Harina ACME", "Kilo", 50, 1  ));
        articulos.add( new Articulo("GG", "Bebida ACME", "Litro", 150, 2  ));
        articulos.add( new Articulo("HH", "Arroz ACME", "Kilo", 40, 3  ));
        
        ventas = new ArrayList<>();
        ventas.add( new Venta("1", "01/01/2023", "111", "AA", 1,650 ));
        ventas.add( new Venta("2", "01/02/2023", "111", "BB", 2,450 ));
        ventas.add( new Venta("3", "03/04/2023", "111", "CC", 3,150 ));
        ventas.add( new Venta("4", "03/04/2023", "222", "AA", 1,660 ));
        ventas.add( new Venta("5", "05/04/2023", "222", "BB", 1,430 ));
        ventas.add( new Venta("6", "05/05/2023", "222", "EE", 1,5));
        ventas.add( new Venta("7", "05/06/2023", "333", "AA", 1,660 ));
        ventas.add( new Venta("8", "01/07/2023", "333", "GG", 1,3 ));

    }

    // Método para obtener todos los registros
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

     public ArrayList<Articulo> obtenerArticulos() {
        return articulos;
    }

    public ArrayList<Venta> obtenerVentas() {
        return ventas;
    }
        
    
    public int getTotalClientes() {
        return clientes.size();
    }
    public int getTotalArticulos() {
        return articulos.size();
    }
    public int getTotalVentas() {
        return ventas.size();
    }
    
    
    
    // Método para obtener un registro por ID
    public Cliente obtenerClientePorDNI(String DNI) {
        for (Cliente registro : clientes) {
            if (registro.getDni().equals(DNI) ) {
                return registro;
            }
        }
        return null; // Retornar null si no se encuentra el registro
    }

     public Articulo obtenerArticuloPorCodigo(String Codigo) {
        for (Articulo registro : articulos ) {
            if (registro.getCodigo().equals(Codigo) ) {
                return registro;
            }
        }
        return null; // Retornar null si no se encuentra el registro
    }
     
     
     public Venta  obtenerVentaPorCodigo(String Codigo) {
        for (Venta registro : ventas ) {
            if (registro.getCodigo().equals(Codigo) ) {
                return registro;
            }
        }
        return null; // Retornar null si no se encuentra el registro
    }
     
     
     
    // Método para agregar un nuevo registro
    public void agregarCliente(Cliente nuevoRegistro) {
        clientes.add(nuevoRegistro);
    }

    public void agregarArticulo(Articulo nuevoRegistro) {
        articulos.add(nuevoRegistro);
    }
    
    public void agregarVenta(Venta  nuevoRegistro) {
        ventas.add(nuevoRegistro);
    }
    
    

    
    // Método para actualizar un registro existente por ID
    public boolean actualizarCliente(String DNI, Cliente registroActualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente registro = clientes.get(i);
            if (registro.getDni().equals(DNI)  ) {
                clientes.set(i, registroActualizado);
                return true; // Registro actualizado con éxito
            }
        }
        return false; // No se encontró el registro para actualizar
    }

// Método para actualizar un registro existente por Codigo
    public boolean actualizarArticulo(String Codigo, Articulo registroActualizado) {
        for (int i = 0; i < articulos.size(); i++) {
            Articulo registro = articulos.get(i);
            if (registro.getCodigo().equals(Codigo)  ) {
                articulos.set(i, registroActualizado);
                return true; // Registro actualizado con éxito
            }
        }
        return false; // No se encontró el registro para actualizar
    }

     public boolean actualizarVenta(String Codigo, Venta  registroActualizado) {
        for (int i = 0; i < ventas.size(); i++) {
            Venta registro = ventas.get(i);
            if (registro.getCodigo().equals(Codigo)  ) {
                ventas.set(i, registroActualizado);
                return true; // Registro actualizado con éxito
            }
        }
        return false; // No se encontró el registro para actualizar
    }
     
    

// Método para eliminar un registro por ID
    public boolean eliminarCliente(String DNI) {
        for (Cliente registro : clientes) {
            if (registro.getDni().equals( DNI )) {
                clientes.remove(registro);
                return true; // Registro eliminado con éxito
            }
        }
        return false; // No se encontró el registro para eliminar
    }
    
    
// Método para eliminar un registro por Codigo
    public boolean eliminarArticulo(String Codigo) {
        for (Articulo registro : articulos) {
            if (registro.getCodigo().equals( Codigo )) {
                articulos.remove(registro);
                return true; // Registro eliminado con éxito
            }
        }
        return false; // No se encontró el registro para eliminar
    }
    
    
        public boolean eliminarVenta(String Codigo) {
        for (Venta registro : ventas) {
            if (registro.getCodigo().equals( Codigo )) {
                ventas.remove(registro);
                return true; // Registro eliminado con éxito
            }
        }
        return false; // No se encontró el registro para eliminar
    }
        
    public Cliente obtenerSiguienteCliente() {
        if (indiceActual < clientes.size()) {
            Cliente cliente = clientes.get(indiceActual);
            indiceActual++;
            return cliente;
        } else {
            // Si hemos llegado al final de la lista, restablecemos el índice y devolvemos null
            indiceActual = 0;
            return null;
        }
    }
     public Articulo obtenerSiguienteArticulo() {
        if (indiceActual < articulos.size()) {
            Articulo articulo = articulos.get(indiceActual);
            indiceActual++;
            return articulo;
        } else {
            // Si hemos llegado al final de la lista, restablecemos el índice y devolvemos null
            indiceActual = 0;
            return null;
        }
    }
     
      public Venta obtenerSiguienteVenta() {
        if (indiceActual < ventas.size()) {
            Venta venta  = ventas.get(indiceActual);
            indiceActual++;
            return venta;
        } else {
            // Si hemos llegado al final de la lista, restablecemos el índice y devolvemos null
            indiceActual = 0;
            return null;
        }
    }
      
}