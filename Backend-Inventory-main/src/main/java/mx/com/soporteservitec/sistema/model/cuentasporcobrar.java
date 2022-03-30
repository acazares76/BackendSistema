package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cuentasporcobrar")
public class cuentasporcobrar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int id_cuentas_por_cobrar;
		private int id_cliente;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="monto_abonado")
	private String monto_abonado;
	@Column(name="date_registere")
	private String date_register;
	@Column(name="status")
	private Boolean status;
	public int getId_cuentas_por_cobrar() {
		return id_cuentas_por_cobrar;
	}
	/*public void setId_cuentas_por_cobrar(int id_cuentas_por_cobrar) {
		this.id_cuentas_por_cobrar = id_cuentas_por_cobrar;
	}*/
	
	public int getId_cliente() {
		return id_cliente;
	}
	/*public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}*/
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMonto_abonado() {
		return monto_abonado;
	}
	public void setMonto_abonado(String monto_abonado) {
		this.monto_abonado = monto_abonado;
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

	public cuentasporcobrar(int id_cliente, String descripcion, String monto_abonado, String date_register,
			Boolean status) {
		
		this.id_cliente = id_cliente;
		this.descripcion = descripcion;
		this.monto_abonado = monto_abonado;
		this.date_register = date_register;
		this.status = status;
	}

	public cuentasporcobrar() {
		
	}
	
	
	

}
