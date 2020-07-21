package com.example.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Productos;


public interface IProductosService {


	public List<Productos>listar();

	public Optional<Productos>listarId(int id);

	public int save(Productos p);

	public void delete(int id);
	
}
