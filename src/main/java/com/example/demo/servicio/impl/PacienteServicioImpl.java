package com.example.demo.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Paciente;
import com.example.demo.repositorio.IGenericRepo;
import com.example.demo.repositorio.IPaciente;
import com.example.demo.servicio.IPacienteServicio;

@Service
public class PacienteServicioImpl extends CRUDImpl<Paciente, Integer> implements IPacienteServicio {

	@Autowired
	private IPaciente repo;

	@Override
	protected IGenericRepo<Paciente, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

}

