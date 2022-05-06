package com.idat.tarea.servicio;

import java.util.List;

import com.idat.tarea.models.Item;

public interface ItemServicio {
	
	public void guardarItem(Item item);
	public void editarItem(Item item);
	public void eliminarItem(Integer id);
	public List<Item> listarItem();
	public Item obtenerItemId(Integer id);

}
