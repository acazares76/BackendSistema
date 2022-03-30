package mx.com.soporteservitec.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingresos")
public class ingresos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_ingresos;
	private int id_cliente;
	private int id_producto;
	@Column(name="cantidad")
	private String cantidad;
	@Column(name="precio")
	private String precio;
	@Column(name="fecha_registro")
	private String fecha_registro;
	@Column(name="descuento")
	private String descuento;
	@Column(name="forma_pago")
	private String forma_pago;
	@Column(name="num_recibo")
	private String num_recibo;
	@Column(name="tipo_pago")
	private String tipo_pago;
	@Column(name="tipo_entrega")
	private String tipo_entrega;
	@Column(name="status")
	private Boolean status;
	
	public int getId_ingresos() {
		return id_ingresos;
	}
	/*public void setId_ingresos(int id_ingresos) {
		this.id_ingresos = id_ingresos;
	}*/
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	public String getNum_recibo() {
		return num_recibo;
	}
	public void setNum_recibo(String num_recibo) {
		this.num_recibo = num_recibo;
	}
	public String getTipo_pago() {
		return tipo_pago;
	}
	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	public String getTipo_entrega() {
		return tipo_entrega;
	}
	public void setTipo_entrega(String tipo_entrega) {
		this.tipo_entrega = tipo_entrega;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public ingresos(int id_cliente, int id_producto, String cantidad, String precio, String fecha_registro,
			String descuento, String forma_pago, String num_recibo, String tipo_pago, String tipo_entrega,
			Boolean status) {
		
		this.id_cliente = id_cliente;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha_registro = fecha_registro;
		this.descuento = descuento;
		this.forma_pago = forma_pago;
		this.num_recibo = num_recibo;
		this.tipo_pago = tipo_pago;
		this.tipo_entrega = tipo_entrega;
		this.status = status;
	}
	public ingresos() {
		
	}
	
}
