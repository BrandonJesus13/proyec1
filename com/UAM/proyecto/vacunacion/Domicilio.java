package com.UAM.proyecto.vacunacion;

public class Domicilio
{
	private String calle, numeroExterior ,colonia, municipio, codigoPostal, numeroInterior;
	private Estado estado;
	
	
	//Constructor
	public Domicilio(String calle, String numeroInterior, 
		String numeroExterior, String colonia, String municipio,
		Estado estado, String codigoPostal) 
	{
		
		this.calle = calle;
		this.numeroInterior = numeroInterior;
		this.numeroExterior = numeroExterior;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
	}



	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	
	public String toString() 
	{
		return "Domicilio: \ncalle: " + calle + ", número: " + numeroInterior + 
				" exterior " + numeroExterior + ", "
				+ "colonia: " + colonia + ", municipio: " 
				+ municipio + ", estado: " + estado + ", codigo postal: "
				+ codigoPostal;
	}
	
	
	
}
