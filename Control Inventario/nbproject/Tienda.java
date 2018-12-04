/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.modelo;
import java.util.*;
/**
 *
 * @author Ángel Cruz
 */
public class Tienda {
    
    Tienda miTienda; 
    private ArrayList<Producto> productos;
    private ArrayList<Categoria> categorias;
    private ArrayList<Marca> marcas;
    private ArrayList<Administrador> usuarios;
    private boolean refrigeradorFuncionando = true;
    Administrador admin;
    
    private static Tienda tiendita;
    
    /**
     *
     * @return
     */
    public static Tienda obtenerInstancia(){
        return tiendita;
    }
    
    private Tienda(Tienda miTiendita) {
        this.productos = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.marcas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.miTienda = miTiendita; 
    }
    
    public String toString(){
        return "Producto:\n"+productos+"Categoria:\n"+categorias+"Marca\n"+marcas+"Usuario\n"+usuarios;
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public boolean seEncuentraProducto(String nombre){
        for(int i=0;i<productos.size();i++){ 
            if (nombre.equals(productos.obtenerNombre(i))){ // FALTA OBTENERNOMBRE
                return true;
            }
        }
           return false; 
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public ArrayList<Producto> obtenerProducto(String nombre)
    {
        boolean verificar = seEncuentraProducto(nombre);
        if(verificar == false) 
            return null;   
        
        return productos;
    }
    
    /**
     *
     * @param producto
     * @return
     */
    public boolean anadirUnProducto(Producto producto)
    {
        if(productos.contains(producto))
        {
            return false;
        }
        productos.add(producto);
        return true;
    }
        
    /**
     *
     * @param producto
     * @return
     */
    public boolean borrarProducto(Producto producto)
    {
        if(productos.contains(producto))
        {
            productos.remove(producto);
            return true;
        }
        return false;
        
    }
    
    /**
     *
     * @param producto
     * @return
     */
    public boolean actualizarProducto(Producto producto)
    {
        Producto productoNew = new Producto();
        for (int i=0;i<productos.size();i++) {
            if(productos.get(i).obtenerNombre.equals(producto.obtenerNombre))
            {
                productos.get(i).actualizar(productoNew);
                return true;
            }
        }
            return false;
    }
    
    /**
     *
     * @param nombre
     * @return
     * @see obtenerNombre 
     */
    public boolean seEncuentraMarca(String nombre){
        for(int i=0;i<marcas.size();i++){ 
            if (nombre.equals(marcas.obtenerNombre(i))){ // FALTA OBTENERNOMBRE
                return true;
            }
        }
           return false; 
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public ArrayList<Marca> obtenerMarca(String nombre)
    {
        boolean verificar = seEncuentraMarca(nombre);
        if(verificar == false) 
            return null;   
        
        return marcas;
    }
    
    /**
     *
     * @param marca
     * @return
     */
    public boolean anadirMarca(Marca marca)
    {
        if(marcas.contains(marca))
        {
            return false;
        }
        marcas.add(marca);
        return true;
    }
    
    /**
     *
     * @param categoria
     * @return
     */
    public boolean anadiCategoria(Categoria categoria)
    {
        if(categorias.contains(categoria))
        {
            return false;
        }
        categorias.add(categoria);
        return true;
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public ArrayList<Categoria> obtenerCategoria(String nombre)
    {
        boolean verificar = seEncuentraMarca(nombre);
        if(verificar == false) 
            return null;   
        
        return categorias;
    }
     
    /**
     *
     * @param nombre
     * @return
     */
    public boolean seEncuentraCategoria(String nombre){
        for(int i=0;i<categorias.size();i++){ 
            if (nombre.equals(categorias.obtenerNombre(i))){ // FALTA OBTENERNOMBRE
                return true;
            }
        }
           return false; 
    }
     
    /**
     *
     * @param username
     * @return
     */
    public boolean seEncuentraAdministrador(String username){
         if (username.equals(admin.obtenerNombre)) // FALTA OBTENERNOMBRE
                return true;
         
           return false; 
    }
    
    /**
     *
     * @param administrador
     * @return
     */
    public boolean agregarAdministrador(Administrador administrador)
    {
        if(administrador.obtenerNombre.equals(admin.obtenerNombre))
        {
            return false;
        }
        //administrador.set();
        return true;
    }
      
    /**
     *
     * @return
     */
    public ArrayList<Producto> productosAgotados(){
        
        ArrayList<Producto> productosAgotados = new ArrayList<>();
        productosAgotados.add(producto);
        return(productosAgotados);
    
    }
    
    /**
     *
     * @return ArrayList
     */
    public ArrayList<Producto> productosDescompuestosRefri(){
        
        ArrayList<Producto> productosDescompuestosRefri = new ArrayList<>();
        productosDescompuestosRefri.add(producto);
        return(productosDescompuestosRefri);
    
    }
    /**
     *
     * @return ArrayList
     */
   
}
