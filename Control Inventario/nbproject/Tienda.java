/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;
/**
 *
 * @author Ángel Cruz
 */
public class Tienda {
    
    Tienda miTienda; 
    private ArrayList<String> categorias, productos, marcas, usuarios;
    private final boolean refrigeradorFuncionando = true;
    Administrador admin;
    
    private static Tienda tiendita;
    
    public static Tienda obtenerInstancia(){
   
        tiendita = new Tienda();
        return tiendita;
    
    }
    
    private Tienda() {}
    
    public String toString(){
        return "";
    }
    
    /*
    
    
    public Boolean anadirUnProducto(Producto producto){
        
    }
    
    public Boolean borrarProducto(Producto producto){
    
    }
    
    public Boolean actualizarProducto(Producto producto){
    
    }
    
    public ArrayList<Productos> productosAgotados(){
    
    }
    
    public ArrayList<Productos> productosDescompuestosRefri(){
    
    }
    
    
    */
}
