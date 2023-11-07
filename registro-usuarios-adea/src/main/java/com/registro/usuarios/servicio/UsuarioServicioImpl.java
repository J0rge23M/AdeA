package com.registro.usuarios.servicio;

import java.sql.Date;
import java.util.Calendar;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Rol;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		
		final String staticStatus = "A";
		final Float staticIntentos =(float) 0;
		final Calendar calendar=Calendar.getInstance();
		final java.util.Date fechaActual = calendar.getTime();
//		final Date staticFechaModificacion = new Date(fechaActual.getTime()) ;
		final Date staticFechaModificacion = new Date(fechaActual.getTime()) ;
		
		Usuario usuario = new Usuario(registroDTO.getLogin(),
				registroDTO.getNombre(), registroDTO.getCliente(),
				registroDTO.getEmail(),
				passwordEncoder.encode(registroDTO.getPassword()),Arrays.asList(new Rol("ROLE_USER")),
				staticFechaModificacion,registroDTO.getFechaBaja(),
				staticStatus, staticIntentos,
				registroDTO.getFechaRevocado(), registroDTO.getFechaVigencia(),
				registroDTO.getNoAcceso(), registroDTO.getArea(),
				staticFechaModificacion, registroDTO.getApellidoPaterno(),
				registroDTO.getApellidoMaterno()
				);
		return usuarioRepositorio.save(usuario);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepositorio.findByLogin(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}
	
	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioRepositorio.findAll();
	}
}
