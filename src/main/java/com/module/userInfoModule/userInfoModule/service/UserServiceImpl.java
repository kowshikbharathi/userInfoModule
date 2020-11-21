package com.module.userInfoModule.userInfoModule.service;

import java.util.ArrayList;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.module.userInfoModule.userInfoModule.dto.UserDto;
import com.module.userInfoModule.userInfoModule.entity.UserEntity;
import com.module.userInfoModule.userInfoModule.entity.UserQueryEntity;
import com.module.userInfoModule.userInfoModule.repository.UserRepository;


/**
 * UserServiceImpl which implements UserService.
 * @author Kowshik Bharathi M
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
	    super();	
		this.userRepository=userRepository;
	}
	private final UserRepository userRepository;
	
	@Override
	public UserEntity save(UserEntity userEntity) {
		return UserEntity.formEntity(userRepository.save(UserEntity.formDto(userEntity)));
	}
	
	@Override
	public UserQueryEntity getByName(String userName) {
		UserQueryEntity userEntity= userRepository.getUserIdByName(userName);
		if(Objects.nonNull(userEntity)){
			return userEntity;
		}
		return userEntity;
	}

	 @Override
	 public UserDetails  loadUserByUsername(String userName)  {
	        UserDto userDto = userRepository.findByUserName(userName);
	        return new org.springframework.security.core.userdetails.User(userDto.getUserName(), userDto.getPassword(), new ArrayList<>());
	 }
}
