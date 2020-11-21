package com.cts.security.models;

public class AuthenticationResponse {

	private final String jwt;

	/**
	 * @param jwt
	 */
	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}
	
	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	
	
}
