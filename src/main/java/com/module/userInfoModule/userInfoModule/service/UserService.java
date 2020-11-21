package com.module.userInfoModule.userInfoModule.service;



import org.springframework.security.core.userdetails.UserDetailsService;
import com.module.userInfoModule.userInfoModule.entity.UserEntity;
import com.module.userInfoModule.userInfoModule.entity.UserQueryEntity;

/**
 * UserService which is used for User table CRUD and user authentication.
 * @author Kowshik Bharathi M
 */
public interface UserService extends UserDetailsService{

	/**
	 * save method is used save record in user table
	 * 
	 * @param userEntity.
	 * @return UserEntity
	 */
   public UserEntity save(UserEntity userEntity); 
	
   /**
    * getByName method is used to retrieve userId from userName.  
    * 
    * @param userName
    * @return UUID
    */
   public UserQueryEntity getByName(String userName);
   
}
