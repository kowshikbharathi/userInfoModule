package com.module.userInfoModule.userInfoModule.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.module.userInfoModule.userInfoModule.entity.AuthenticateEntity;
import com.module.userInfoModule.userInfoModule.util.JwtUtil;

/**
 * TokenManager is used to manage token for authentication. 
 * @author KowshikBharathi M 
 */
@Service
public class TokenManager {

	@Autowired
	public TokenManager(AuthenticationManager authenticationManager,JwtUtil jwtUtil) {
	     super();	
		 this.authenticationManager=authenticationManager;
		 this.jwtUtil=jwtUtil;
	}
	
	private final AuthenticationManager authenticationManager;
	private final JwtUtil jwtUtil;
	
	public AuthenticateEntity generateToken(@RequestBody AuthenticateEntity authenticateEntity) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticateEntity.getUserName(), authenticateEntity.getPassword())
            );
        } catch (Exception exception) {
            throw new Exception("inavalid username/password");
        }
        String token=jwtUtil.generateToken(authenticateEntity.getUserName());
        authenticateEntity.setToken(token);
        authenticateEntity.setPassword(null);
    return authenticateEntity;
    }
}
