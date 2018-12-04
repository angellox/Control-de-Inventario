package modelo;

/**
 *
 * @author qooki
 */
public class Administrador {
    //Atributos
    private String usuario;
    private String contrasena;
    private String nombre;
    private Byte rango;
    
    //Constructores
    public Administrador(String nom, byte rang)
    {
        this.nombre = nom;
        this.rango = rang;
    }
    
    public Administrador(String nom)
    {
        this.nombre = nom;
    }
    
    //Mètodos
    public boolean loginCorrecto(String usuario, String contrasena)
    {
        
    }
    
    public byte obtenerRango()
    {
        return this.rango;
    }
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public String toString()
    {
        return "Usuario: "+usuario+"\nNombre: "+nombre+"\nRango: "+rango;
    }
}
