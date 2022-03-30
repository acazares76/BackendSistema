package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class clientes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_cliente;
	@Column(name="rfc")
	private String rfc;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="date_register")
	private String date_register;
	@Column(name="celular")
	private String celular;
	@Column(name="imagen")
	private String imagen;
	@Column(name="status")
	private Boolean status;
	public int getId_tienda() {
		return getId_tienda();
	}
	/*public int getId_cliente() {
		return id_cliente;
	}*/
	
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate_register() {
		return date_register;
	}
	public void setDate_register(String date_register) {
		this.date_register = date_register;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public clientes(String rfc, String name, String address, String phone, String email, String date_register,
			String celular, String imagen, Boolean status) {
	
		this.rfc = rfc;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.date_register = date_register;
		this.celular = celular;
		this.imagen = imagen;
		this.status = status;
	}
	public clientes() {
		
	}
	
	
	
	
	
}
