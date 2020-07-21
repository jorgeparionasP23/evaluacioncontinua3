package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categorias;

@Repository
public interface ICategorias extends CrudRepository<Categorias,Integer>{

	
}
