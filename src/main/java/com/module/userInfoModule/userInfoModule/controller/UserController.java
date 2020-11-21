package com.module.userInfoModule.userInfoModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.module.userInfoModule.userInfoModule.entity.AuthenticateEntity;
import com.module.userInfoModule.userInfoModule.entity.RoleEntity;
import com.module.userInfoModule.userInfoModule.entity.UserEntity;
import com.module.userInfoModule.userInfoModule.entity.UserQueryEntity;
import com.module.userInfoModule.userInfoModule.manager.TokenManager;
import com.module.userInfoModule.userInfoModule.service.RoleService;
import com.module.userInfoModule.userInfoModule.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * UserController which is used for User end point.
 * @author Kowshik Bharathi M
 */

@RestController
@RequestMapping("/users")
@Api(value = "User Service", description = "HealthCare User Module")
public class UserController {

	@Autowired
	public UserController(UserService userService,RoleService roleService,TokenManager tokenManager) {
	     super();	
		 this.userService=userService;
		 this.roleService=roleService;
		 this.tokenManager=tokenManager;
	}
	
	private final UserService userService;
	private final RoleService roleService;
	private final TokenManager tokenManager;
	
	/**
	 * registerUser method is used to register user. 
	 * @param userEntity
	 * @return UserEntity
	 */
	@ApiOperation(value = "Register User API")
	@PostMapping("/register")
	public UserEntity registerUser(@RequestBody UserEntity userEntity) {
		return userService.save(userEntity);
	}
	
	/**
	 * getUser method is used to retrieve userId.
	 * @param userName
	 * @return UserQueryEntity
	 */
	@ApiOperation(value = "Get User API")
	@GetMapping("/{userName}")
	public UserQueryEntity getUser(@PathVariable String userName) {
		return userService.getByName(userName);
	}
	
	/**
	 * registerRole method is used to register Role.
	 * @param roleEntity
	 * @return RoleEntity
	 */
	@ApiOperation(value = "Register Role API")
	@PostMapping("/registerRole")
	public RoleEntity registerRole(@RequestBody RoleEntity roleEntity) {
		return roleService.save(roleEntity);
	}
	
	/**
	 * generateToken method is used for token authentication.
	 * @param authenticateEntity
	 * @return String
	 * @throws Exception
	 */
	
	@ApiOperation(value = "Authenticate API")
	@PostMapping("/authenticate")
	public AuthenticateEntity generateToken(@RequestBody AuthenticateEntity authenticateEntity) throws Exception  {
		return tokenManager.generateToken(authenticateEntity);
	    }
}
