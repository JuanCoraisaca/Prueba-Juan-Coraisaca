/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Profesor;
import Servicio.ProfesorServicio;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ProfesorControl {
    
    private final ProfesorServicio profesorServicio = new ProfesorServicio();
    
    public Profesor crear(String [] args){
        var capitan= new Profesor(Integer.valueOf(args[0]),args[1],args[2]
                ,Integer.valueOf(args[3]));
        this.profesorServicio.crear(capitan);
        return capitan;
    }
    
    public List<Profesor> listar()
    {
        return this.profesorServicio.listar();
    }
    
}
