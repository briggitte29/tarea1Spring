package com.idat.tarea.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tarea.models.Item;
import com.idat.tarea.repositorio.ItemRepositorio;

@Service
public class ItemServImpl implements ItemServicio {
	
	@Autowired
	public ItemRepositorio repositorio;

	@Override
	public void guardarItem(Item item) {
		repositorio.guardarItem(item);
	}

	@Override
	public void editarItem(Item item) {
		repositorio.editarItem(item);
	}

	@Override
	public void eliminarItem(Integer id) {
		repositorio.eliminarItem(id);
	}

	@Override
	public List<Item> listarItem() {
		return repositorio.listarItem();
	}

	@Override
	public Item obtenerItemId(Integer id) {
		return repositorio.obtenerItemId(id);
	}

}
