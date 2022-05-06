package com.idat.tarea.models;

import java.io.Serializable;

public class Item {
	

	private Integer idItem;
	private String item;
	private Integer cantidad;
	private Double total;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer idItem, String item, Integer cantidad, Double total) {
		super();
		this.idItem = idItem;
		this.item = item;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
