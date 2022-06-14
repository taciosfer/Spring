package com.generation.lojagames.security;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.generation.lojagames.model.Usuario;

public class UserDetailsImplementation implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;
	
	private List<GrantedAuthority> authorities;
	
	public UserDetailsImplementation(Usuario usuario) {
		this.username = usuario.getUsuario();
		this.password = usuario.getSenha();
	}
	
	public UserDetailsImplementation() {}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}