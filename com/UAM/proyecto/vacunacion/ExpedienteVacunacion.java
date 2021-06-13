/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import java.io.FileWriter;
import java.io.IOException;

public class ExpedienteVacunacion implements Serializable{

	//Datos miembro: van a ser clase
	
	public List<ExpedienteVacunacion> expediente1;
	private int Folio;
	private Date fechaUnica;
	private Persona p;
	private Domicilio d;
	
	//nombre - colección
	//Clase vacuna
	//correo electrónico
	//direccion - colección
	//padecimientos diabetes e hipertención
	
	
	
	//Constructor de la clase padre
	public ExpedienteVacunacion(int Folio, Persona p, Domicilio d)
	{
		//El expediente de vacunación se conforma de un Folio, 
		//un objeto Persona y un objeto Domicilio
		this.Folio = Folio;
		this.p = p;
		this.d=d;
	}
	
	
	public static void main(String[] args) 
	{
		int contador = 0;
		//Valores de prueba Aaron:
		Persona aaron = new Persona("Aaron","Alcocer","Rodriguez","acar_133@uam.mx");
		Domicilio domicilioAaron = new Domicilio("Madero", "120" , "A", "Ejidos hermanos", "Morelia",
				Estado.Michoacan, "59275");
		
		//Valores de prueba Brandon:
		Persona brandon = new Persona("Brandon","","","b,randon_123@hotmail.com");
		Domicilio domicilioBrandon = new Domicilio("El arrecife", "939" , "S/N", "Estrella", "Mazatlán",
				Estado.Sinaloa, "");
		
		//Valores de prueba Eduardo:
		Persona eduardo = new Persona("Eduardo","Cortes","Montaño","");
		Domicilio domicilioEduardo = new Domicilio("Zapata", "1076" , "2", "", "Alcaldía GAM",
				Estado.CiudadDeMexico, "07420");
		
		//Creando expedientes de prueba
		ExpedienteVacunacion expedienteAaron   = new ExpedienteVacunacion(++contador,aaron,domicilioAaron); //se usó contructor inicial
		ExpedienteVacunacion expedienteBrandon = new ExpedienteVacunacion(++contador,brandon,domicilioBrandon); //se usó contructor inicial
		ExpedienteVacunacion expedienteEduardo = new ExpedienteVacunacion(++contador,eduardo,domicilioEduardo); //se usó contructor inicial
		
		
		System.out.println(expedienteAaron.toString() + "\n");
		System.out.println(expedienteBrandon.toString() + "\n");
		System.out.println(expedienteEduardo.toString() + "\n");
		
		
		Validación val = new Validación();
		//test validación Aaron
		System.out.println(val.validarPersona(aaron));
		System.out.println(val.validarDomicilio(domicilioAaron));
		System.out.println(val.validarCodigoPostal(domicilioAaron.getCodigoPostal()));
		
		//Test Validación Brandon
		System.out.println(val.validarPersona(brandon));
		System.out.println(val.validarDomicilio(domicilioBrandon));
		System.out.println(val.validarCodigoPostal(domicilioBrandon.getCodigoPostal()));
		
		//test validación Eduardo
		System.out.println(val.validarPersona(eduardo));
		System.out.println(val.validarDomicilio(domicilioEduardo));
		System.out.println(val.validarCodigoPostal(domicilioEduardo.getCodigoPostal()));
		
	}

	public String jsonSerializable(ExpedienteVacunacion eV)
	{
		
		return eV.toString();
	}
	
	@Override
	public String toString() 
	{
		
		return "ExpedienteVacunacion:\n"
				+ "Folio = " + Folio + 
				"\nDatos del interesado:\n" + p + 
				"\n" + d.toString();
	}

	
	 
	
}