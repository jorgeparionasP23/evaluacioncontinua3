package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IProductos;
import com.example.demo.interfacesService.IProductosService;
import com.example.demo.model.Productos;

@Service
public class ProductosService implements IProductosService {

	@Autowired
	private IProductos data;
	

	@Override
	public List<Productos> listar() {
		return (List<Productos>)data.findAll();
	}

	@Override
    public Optional<Productos> listarId(int id) {        
        return data.findById(id);
    }
	
	@Override
	public int save(Productos p) {
		int res = 0;
		Productos productos = data.save(p);
		if(!productos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
	data.deleteById(id);	
	}
}