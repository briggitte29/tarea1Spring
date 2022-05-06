package com.idat.tarea.repositorio;

import java.util.List;

import com.idat.tarea.models.Item;

public interface ItemRepositorio {
	
	public void guardarItem(Item item);
	public void editarItem(Item item);
	public void eliminarItem(Integer id);
	public List<Item> listarItem();
	public Item obtenerItemId(Integer id);
	

}
