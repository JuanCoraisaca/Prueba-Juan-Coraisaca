/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ProfesorServicio implements IProfesorServicio{
    
    private final List<Profesor> profesorList = new ArrayList<>();

    @Override
    public Profesor crear(Profesor profesor) {
        this.profesorList.add(profesor);
        return profesor;

    }

    @Override
    public List<Profesor> listar() {
        return this.profesorList;

    }
    
}
