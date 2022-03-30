package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_usuarios;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	@Column(name="celular")
	private String celular;
	@Column(name="email")
	private String email;
	@Column(name="usuario")
	private String usuario;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="date_register")
	private String date_register;
	@Column(name="status")
	private Boolean status;
	public int getId_tienda() {
		return getId_tienda();
	}
	public int getId_usuarios() {
		return id_usuarios;
	}
	/*public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}*/
	
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public usuarios(String name, String address, String phone, String celular, String email, String usuario,
			String password, String role, String date_register, Boolean status) {
		
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.celular = celular;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
		this.role = role;
		this.date_register = date_register;
		this.status = status;
	}
	public usuarios() {
		
	}
		
}
