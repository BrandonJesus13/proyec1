/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;

/**
 *
 * @author 
 */
public class Vacuna 
{
	private String nombre;
	TipoDosis tDosis;
	
	//Constructor por defecto
	Vacuna(String nombre, TipoDosis tDosis)
	{
		this.nombre = nombre;
		this.tDosis = tDosis;
	}
}