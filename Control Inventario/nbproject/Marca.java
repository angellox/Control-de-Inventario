package modelo;

/**
 *
 * @author qooki
 */
public class Marca {
    //Atributos
    private final String nombre;
    private Dia diaDeLaSemanaQueLlega;
    
    //C O N S T R U C T O R
    public Marca(String _name, Dia _day)
    {
        this.nombre = _name;
        this.diaDeLaSemanaQueLlega = _day;
    }
    
    //METODOS 
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public Dia obtenerDia()
    {
        return this.diaDeLaSemanaQueLlega;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o == this)
                {
                    return true;
                }
        return false;
    }
    
    @Override
    public String toString()
    {
        return "\nMarca: "+nombre+"\nDia de llegada: "+diaDeLaSemanaQueLlega;
    }
}
