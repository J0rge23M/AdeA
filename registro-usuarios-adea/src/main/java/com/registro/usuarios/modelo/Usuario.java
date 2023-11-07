package com.registro.usuarios.modelo;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "LOGIN", unique = true, nullable = false, length=20)
	private String login;


	@Column(name = "NOMBRE", length=50, nullable=false)
	private String nombre;

	@Column(name = "CLIENTE", nullable = false)
	private Float cliente;

	@Column(name = "EMAIL", length= 50)
	private String email;
	
	@Column(name = "PASSWORD", nullable = false, length=100)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
			)
	private Collection<Rol> roles;

	@Column(name = "FECHAALTA", nullable = false)
	private Date fechaAlta;

	@Column(name = "FECHABAJA")
	private Date fechaBaja;

	@Column(name = "STATUS", nullable = false, length= 1, columnDefinition = "VARCHAR (1) DEFAULT 'A'")
	private String status;

	@Column(name = "INTENTOS", nullable = false)
	private Float intentos;

	@Column(name = "FECHAREVOCADO")
	private Date fechaRevocado;

	@Column(name = "FECHA_VIGENCIA")
	private Date FechaVigencia;
	
	@Column(name = "NO_ACCESO")
	private Integer noAcceso;

	@Column(name = "AREA", length = 4)
	private Integer area;

	@LastModifiedDate
	@Column(name = "FECHAMODIFICACION", nullable = false)
	private Date fechaModificacion;

	@Column(name = "APELLIDO_PATERNO", length = 50)
	private String apellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO", length = 50)
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

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	
	
	public Usuario(Long id, String login, String nombre, Float cliente, String email, String password,
			Collection<Rol> roles, Date fechaAlta, Date fechaBaja, String status, Float intentos, Date fechaRevocado,
			Date fechaVigencia, Integer noAcceso, Integer area, Date fechaModificacion, String apellidoPaterno,
			String apellidoMaterno) {
		super();
		this.id = id;
		this.login = login;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.password = password;
		this.roles = roles;
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

	
	
	public Usuario(String login, String nombre, Float cliente, String email, String password, Collection<Rol> roles,
			Date fechaAlta, Date fechaBaja, String status, Float intentos, Date fechaRevocado, Date fechaVigencia,
			Integer noAcceso, Integer area, Date fechaModificacion, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.login = login;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.password = password;
		this.roles = roles;
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

	public Usuario() {
		
	}

}
