package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class proveedores {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int id_proveedor;
	@Column(name="rfc")
	private String rfc;
	@Column(name="name")
	private String name;
	@Column(name="n_account")
	private int n_account;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="bank")
	private String bank;
	@Column(name="interbank code")
	private String interbankcode;
	@Column(name="date_register")
	private String date_register;
	@Column(name="status")
	private Boolean status;
		public int getId_tienda() {
		return getId_tienda();
	}
	
	/*public int getId_proveedor() {
		return id_proveedor;
	}*/
		
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
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
	public int getN_account() {
		return n_account;
	}
	public void setN_account(int n_account) {
		this.n_account = n_account;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getInterbankcode() {
		return interbankcode;
	}
	public void setInterbankcode(String interbankcode) {
		this.interbankcode = interbankcode;
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
	public proveedores(String rfc, String name, int n_account, String phone, String address, String email, String bank,
			String interbankcode, String date_register, Boolean status) {
		
		this.rfc = rfc;
		this.name = name;
		this.n_account = n_account;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.bank = bank;
		this.interbankcode = interbankcode;
		this.date_register = date_register;
		this.status = status;
	}
	public proveedores() {
		
	}
	
}