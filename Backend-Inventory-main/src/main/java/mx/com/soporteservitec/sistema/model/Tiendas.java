package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiendas")
public class Tiendas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idtienda;
		private String nombre;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="RFC")
	private String RFC;
	@Column(name="correo")
	private String correo;
	@Column(name="fecharegistro")
	private String fecharegistro;
	@Column(name="status")
	private Boolean status;
	public int getId_tienda() {
		return idtienda;
	}
	/*public void setId_tienda(int id_tienda) {
		this.idtienda = id_tienda;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Tiendas(String nombre, String direccion, String telefono, String rFC, String correo, String fecharegistro,
			Boolean status) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		RFC = rFC;
		this.correo = correo;
		this.fecharegistro = fecharegistro;
		this.status = status;
	}
	public Tiendas() {

	}
	
	
}
