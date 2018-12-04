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
public class Dia {
    //A T R I B U T O S 

    private static final String diasDeLaSemana = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes"];
    private final byte numeroDeDia;
    
    //C O N S T R U C T O R 
    private Dia(byte _diaDeLaSemana)
    {
        this.numeroDeDia = _diaDeLaSemana;
    }
    
    //M E T O D O S
    public Dia obtenerDia(byte numDia)
    {
        return 
    }
    
    public boolean esTarde()
    {
        
    }
    
    public String obtenerNombre()
    {
        
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
        return "Numero de dia: "+numeroDeDia;
    }
    
    
}
