/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;
public class Persona 
{
	private String nombre, apellidoPaterno, apellidoMaterno,
	curp, telefonoPrincipal,telefonoSecundario;
	
	private Vacuna vacuna;
	private String email;//��ste realmente debe ser una clase adicional?
	private Padecimientos padecimientos; //�S�lo dos padecimientos?
	int edad;

    Persona(String eduardo, String cortes, String montaño, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public String validarMail(String email)
	{
		boolean flag = true;
		return email;
	}
	//Constructor Completo
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String telefonoPrincipal,
			String telefonoSecundario, Vacuna v, String email, Padecimientos padecimientos, int edad) {
		
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.curp = curp;
		this.telefonoPrincipal = telefonoPrincipal;
		this.telefonoSecundario = telefonoSecundario;
		this.vacuna = v;
		this.email = email;
		this.padecimientos = padecimientos;
		this.edad = edad;
        }
	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getTelefonoPrincipal() {
		return telefonoPrincipal;
	}

	public void setTelefonoPrincipal(String telefonoPrincipal) {
		this.telefonoPrincipal = telefonoPrincipal;
	}

	public String getTelefonoSecundario() {
		return telefonoSecundario;
	}

	public void setTelefonoSecundario(String telefonoSecundario) {
		this.telefonoSecundario = telefonoSecundario;
	}

	public Vacuna getV() {
		return vacuna;
	}

	public void setV(Vacuna v) {
		this.vacuna = v;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Padecimientos getPadecimientos() {
		return padecimientos;
	}

	public void setPadecimientos(Padecimientos padecimientos) {
		this.padecimientos = padecimientos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + " " + apellidoPaterno + " "
				+ apellidoMaterno + ", curp: " + curp + ", telefono: " + telefonoPrincipal
				+ ", n�mro adicional: " + telefonoSecundario + ", v: " + vacuna + ", email=" + email + ", padecimientos: "
				+ padecimientos + ", edad: " + edad + " a�os";
	}

	
	
}

