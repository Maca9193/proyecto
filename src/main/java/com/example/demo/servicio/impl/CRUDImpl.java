package com.example.demo.servicio.impl;

import java.util.List;
import java.util.Optional;

import com.example.demo.repositorio.IGenericRepo;

public abstract class CRUDImpl<T, ID> {

	protected abstract IGenericRepo<T, ID> getRepo();

	public T registrar(T p) throws Exception {
		return getRepo().save(p);
	}

	public T modificar(T p) throws Exception {
		return getRepo().save(p);
	}

	public List<T> listar() throws Exception {
		// TODO Auto-generated method stub
		return getRepo().findAll();
	}

	public T listarPorId(ID id) throws Exception {
		// TODO Auto-generated method stub
		Optional<T> t1 = getRepo().findById(id);
		return t1.isPresent() ? t1.get() : null;
	}

	public void eliminar(ID id) throws Exception {
		// TODO Auto-generated method stub
		getRepo().deleteById(id);
	}

}