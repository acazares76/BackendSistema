package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class productos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_producto;
	@Column(name="codigo")
	private String codigo;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="public_price")
	private String public_price;
	@Column(name="existence")
	private String existence;
	@Column(name="precio")
	private String precio;
	@Column(name="unidad")
	private String unidad;
	@Column(name="imagen")
	private String imagen;
	@Column(name="date_register")
	private String date_register;
	@Column(name="status")
	private Boolean status;
	public int getId_tienda() {
		return getId_tienda();
	}
	/*public int getId_producto() {
		return id_producto;
	}*/
	
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublic_price() {
		return public_price;
	}
	public void setPublic_price(String public_price) {
		this.public_price = public_price;
	}
	public String getExistence() {
		return existence;
	}
	public void setExistence(String existence) {
		this.existence = existence;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDate_register() {
		return date_register;
	}
	public void setDate_register(String date_register) {
		this.date_register = date_register;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public productos(String codigo, String name, String description, String public_price, String existence,
			String precio, String unidad, String imagen, String date_register, Boolean status) {
	
		this.codigo = codigo;
		this.name = name;
		this.description = description;
		this.public_price = public_price;
		this.existence = existence;
		this.precio = precio;
		this.unidad = unidad;
		this.imagen = imagen;
		this.date_register = date_register;
		this.status = status;
	}

	public productos() {
		
	}
		
}
