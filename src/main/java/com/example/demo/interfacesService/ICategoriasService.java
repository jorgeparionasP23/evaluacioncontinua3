package com.example.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Categorias;

public interface ICategoriasService {


	public List<Categorias>listar();

	public Optional<Categorias>listarId(int id);

	public int save(Categorias p);

	public void delete(int id);

}