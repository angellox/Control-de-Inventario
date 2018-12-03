/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author qooki
 */
class Categoria {
    //Atributos
    private String nombre;
    
    // Constructor 
    protected Categoria(String _nombre)
    {
        this.nombre=_nombre;
    }
    
    // M È T O D O S
    public Categoria obtenerInstancia()
    {
        return this;
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
        return "Nombre: "+nombre;
    }
            
}

