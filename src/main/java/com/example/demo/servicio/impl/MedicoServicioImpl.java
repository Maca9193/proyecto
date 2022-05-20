package com.example.demo.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Medico;
import com.example.demo.repositorio.IGenericRepo;
import com.example.demo.repositorio.IMedico;
import com.example.demo.servicio.IMedicoServicio;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio {

	@Autowired
	private IMedico repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

}
