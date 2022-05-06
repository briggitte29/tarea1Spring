package com.idat.tarea.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.idat.tarea.models.Item;
import com.idat.tarea.servicio.ItemServicio;

@RestController
@RequestMapping("/item/v1")
public class ItemControlador {

	@Autowired
	private ItemServicio servicio;
	
	@RequestMapping(path = "/listar", method =RequestMethod.GET )
	public ResponseEntity<List<Item>> listarItem(){
		return new ResponseEntity<List<Item>>(servicio.listarItem(),HttpStatus.CREATED);
	}
	
	@RequestMapping(path= "/guardar", method= RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Item item){
		servicio.guardarItem(item);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path= "/listar/{id}", method= RequestMethod.GET)
	public ResponseEntity<Item> listarPorId(@PathVariable Integer id) {
			Item i= servicio.obtenerItemId(id);
			
			if(i !=null)
				return new ResponseEntity<Item>(i, HttpStatus.OK);
			
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(path= "/editar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Item item) {
		Item i= servicio.obtenerItemId(item.getIdItem());
		
		if(i !=null) {
			servicio.editarItem(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	
	@RequestMapping(path= "/eliminar/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<Void>	eliminar(@RequestBody Integer id) {
		Item i= servicio.obtenerItemId(id);
		
		if(i !=null) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
}
	
	
	
}

