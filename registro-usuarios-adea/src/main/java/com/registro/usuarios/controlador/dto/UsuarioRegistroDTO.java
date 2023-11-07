package com.registro.usuarios.controlador.dto;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.registro.usuarios.modelo.Rol;

public class UsuarioRegistroDTO {

	private Long id;
	private String login;
	private String nombre;
	private Float cliente;
	private String email;
	private String password;
	private Date fechaAlta;
	private Date fechaBaja;
	private String status;
	private Float intentos;
	private Date fechaRevocado;
	private Date FechaVigencia;
	private Integer noAcceso;
	private Integer area;
	private Date fechaModificacion;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Float getCliente() {
		return cliente;
	}

	public void setCliente(Float cliente) {
		this.cliente = cliente;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getIntentos() {
		return intentos;
	}

	public void setIntentos(Float intentos) {
		this.intentos = intentos;
	}

	public Date getFechaRevocado() {
		return fechaRevocado;
	}

	public void setFechaRevocado(Date fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}

	public Date getFechaVigencia() {
		return FechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		FechaVigencia = fechaVigencia;
	}

	public Integer getNoAcceso() {
		return noAcceso;
	}

	public void setNoAcceso(Integer noAcceso) {
		this.noAcceso = noAcceso;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	
	
	public UsuarioRegistroDTO(Long id, String login, String nombre, Float cliente, String email, String password,
			Date fechaAlta, Date fechaBaja, String status, Float intentos, Date fechaRevocado,
			Date fechaVigencia, Integer noAcceso, Integer area, Date fechaModificacion, String apellidoPaterno,
			String apellidoMaterno) {
		super();
		this.id = id;
		this.login = login;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.password = password;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.status = status;
		this.intentos = intentos;
		this.fechaRevocado = fechaRevocado;
		FechaVigencia = fechaVigencia;
		this.noAcceso = noAcceso;
		this.area = area;
		this.fechaModificacion = fechaModificacion;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	
	
	public UsuarioRegistroDTO(String login, String nombre, Float cliente, String email, String password,
			Date fechaAlta, Date fechaBaja, String status, Float intentos, Date fechaRevocado,
			Date fechaVigencia, Integer noAcceso, Integer area, Date fechaModificacion, String apellidoPaterno,
			String apellidoMaterno) {
		super();
		this.login = login;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.password = password;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.status = status;
		this.intentos = intentos;
		this.fechaRevocado = fechaRevocado;
		FechaVigencia = fechaVigencia;
		this.noAcceso = noAcceso;
		this.area = area;
		this.fechaModificacion = fechaModificacion;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public UsuarioRegistroDTO() {

	}

}
