package com.module.userInfoModule.userInfoModule.entity;

import java.util.Date;
import java.util.UUID;
import com.module.userInfoModule.userInfoModule.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserEntity which represent entity for User table.
 * @author Kowshik Bharathi M
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity{

	private UUID userId;
	private String userName;
	private UUID roleId;
	private String lastUpdateUserId;
	private Date lastUpdateDateTime;
	
	public static UserEntity formEntity(UserDto userDto) {
		UserEntity userEntity=new UserEntity();
		userEntity.setUserId(userDto.getUserId());
		userEntity.setUserName(userDto.getUserName());
		userEntity.setRoleId(userDto.getRoleId());
		userEntity.setLastUpdateUserId(userDto.getLastUpdateUserId());
		userEntity.setLastUpdateDateTime(userDto.getLastUpdateDateTime());
		return userEntity;
	}
	
	public static UserDto formDto(UserEntity userEntity) {
		UserDto userDto=new UserDto();
		userDto.setUserId(userEntity.getUserId());
		userDto.setUserName(userEntity.getUserName());
		userDto.setRoleId(userEntity.getRoleId());
		userDto.setLastUpdateUserId(userEntity.getLastUpdateUserId());
		userDto.setLastUpdateDateTime(userEntity.getLastUpdateDateTime());
		return userDto;
	}
}
