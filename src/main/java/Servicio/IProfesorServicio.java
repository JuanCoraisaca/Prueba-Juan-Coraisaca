/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Profesor;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface IProfesorServicio {
    
    public Profesor crear(Profesor profesor);
    public List<Profesor> listar();
    
}
