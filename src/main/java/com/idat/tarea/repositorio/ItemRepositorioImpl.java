package com.idat.tarea.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.idat.tarea.models.Item;

@Repository
public class ItemRepositorioImpl implements ItemRepositorio {

	public List<Item> listar= new ArrayList<Item>();
	
	@Override
	public void guardarItem(Item item) {
		listar.add(item);

	}

	@Override
	public void editarItem(Item item) {
		listar.remove(obtenerItemId(item.getIdItem()));
		listar.add(item);

	}

	@Override
	public void eliminarItem(Integer id) {
		listar.remove(obtenerItemId(id));

	}

	@Override
	public List<Item> listarItem() {
		return listar;
	}

	@Override
	public Item obtenerItemId(Integer id) {
		return listar.stream().filter(item -> item.getIdItem()== id).findFirst().orElse(null);
	}

}
