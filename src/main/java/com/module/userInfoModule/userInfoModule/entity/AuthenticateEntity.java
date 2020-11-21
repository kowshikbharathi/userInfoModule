package com.module.userInfoModule.userInfoModule.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AuthenticateEntity which represent entity for authentication.
 * @author Kowshik Bharathi M
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticateEntity {

	private String userName;
	private String password;
	private String token;
}
