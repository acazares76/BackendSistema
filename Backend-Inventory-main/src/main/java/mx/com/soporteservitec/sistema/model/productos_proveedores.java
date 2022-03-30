package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class productos_proveedores {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idproductos_proveedores;
	private int id_proveedores;
	private int id_productos;
	@Column(name="cantidad")
	private String cantidad;
	@Column(name="status")
	private Boolean status;
	@Column(name="date_register")
	private String date_register;
	public int getIdproductos_proveedores() {
		return idproductos_proveedores;
	}
	/*public void setIdproductos_proveedores(int idproductos_proveedores) {
		this.idproductos_proveedores = idproductos_proveedores;
	}*/
	public int getId_proveedores() {
		return id_proveedores;
	}
	/*public void setId_proveedores(int id_proveedores) {
		this.id_proveedores = id_proveedores;
	}*/
	public int getId_productos() {
		return id_productos;
	}
	/*public void setId_productos(int id_productos) {
		this.id_productos = id_productos;
	}*/
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getDate_register() {
		return date_register;
	}
	public void setDate_register(String date_register) {
		this.date_register = date_register;
	}
	public productos_proveedores(int id_proveedores, int id_productos, String cantidad, Boolean status,
			String date_register) {
		
		this.id_proveedores = id_proveedores;
		this.id_productos = id_productos;
		this.cantidad = cantidad;
		this.status = status;
		this.date_register = date_register;
	}
	public productos_proveedores() {
		
	}
	
}
