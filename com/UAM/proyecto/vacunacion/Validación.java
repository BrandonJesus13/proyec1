/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;

/**
 *
 * @author betybob
 */

public class Validación 
{
	
	public String validarPersona(Persona persona)
	{
		boolean banderaLocal ,banderaGlobal = true;
		StringBuilder msgValidacion = new StringBuilder("");
		
		banderaLocal = persona.getNombre() != null && !persona.getNombre().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía
			 msgValidacion.append("Falta nombre \n");
			 
		}
		
		banderaLocal = persona.getApellidoPaterno() != null && !persona.getApellidoPaterno().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía, se concatena un mensaje para poder así mencionar que falta
			 msgValidacion.append("Falta apellido paterno\n");
			 
		}
		
		banderaLocal = persona.getEmail() != null && !persona.getEmail().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal || !validarCorreo(persona.getEmail()))
		{
			msgValidacion.append("Correo electrónico incorrecto o vacío");
			
		}
		
		
		return msgValidacion.toString();
	}
	
	public String validarDomicilio(Domicilio domicilio)
	{
		boolean banderaLocal ,banderaGlobal = true;
		StringBuilder msgValidacion = new StringBuilder("");
		
		banderaLocal = domicilio.getCalle() != null && !domicilio.getCalle().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía
			 msgValidacion.append("Calle incorrecta \n");
			 
		}
		
		banderaLocal = domicilio.getColonia() != null && !domicilio.getColonia().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía
			 msgValidacion.append("Colonia incorrecta \n");
			 
		}
		
		banderaLocal = domicilio.getCodigoPostal() != null && !domicilio.getCodigoPostal().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía
			 msgValidacion.append("Código postal incorrecto \n");
			 
		}
		
		banderaLocal = domicilio.getNumeroInterior() != null && !domicilio.getNumeroInterior().trim().isEmpty();
		banderaGlobal &= banderaLocal;
		if(!banderaLocal)
		{
			//en caso de que esté vacía
			 msgValidacion.append("Numero interior incorrecto\n");
			 
		}
		
				
		
		if (!banderaGlobal)
		{
			return "Datos faltantes: " + msgValidacion.toString();
		}
		else
		{	
			//replicar esta estructura en las otras validaciones
			//se retirará esta info al final, solo para fines de comprobar que esta´correcto
			return "Domiclio Correcto";
		}
	}
	
	public boolean validacionIndividualDomicilioStrings(String valorDomicilio)
	{
            return !valorDomicilio.isEmpty() && !valorDomicilio.isEmpty();
		
	}
	
	//función que valida el correo
	public boolean validarCorreo(String correo)
	{
		boolean bandera = true;
		
		//Existe una función ya predefinida que permite validar correos
		//cortesía de: https://www.tutorialspoint.com/validate-email-address-in-java
		
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    bandera = correo.matches(regex);
		return bandera;
	}
	
	public boolean validarCodigoPostal(String codigoPostal)
	{
		boolean bandera = true;
		
		//Existe una función ya predefinida con  algo llamado 
		//Expresiones regulares (REGular EXpresions = regex)
		
		String regex = "\\d{5}";//sólo permite dígitos y siempre 5
	    bandera = codigoPostal.matches(regex);
		return bandera;
	}
	
}