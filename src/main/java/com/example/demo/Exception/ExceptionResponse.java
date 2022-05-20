package com.example.demo.Exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private LocalDateTime fecha;
	private String mensaje;
	private String detalles;

	// Constructor vacio
	public ExceptionResponse() {
	}

	// Constructor
	public ExceptionResponse(LocalDateTime fecha, String mensaje, String detalles) {
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	// Getters & Setters
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

}
