package com.module.userInfoModule.userInfoModule.entity;

import java.util.List;
import java.util.UUID;
import com.module.userInfoModule.userInfoModule.dto.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RoleEntity which represent entity for Role table.
 * @author Kowshik Bharathi M
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity{
	
	private UUID roleId;
	private String roleName;
	private List<UserEntity> users;
	
	public static RoleEntity formEntity(RoleDto roleDto) {
		RoleEntity roleEntity=new RoleEntity();
		roleEntity.setRoleId(roleDto.getRoleId());
		roleEntity.setRoleName(roleDto.getRoleName());
		return roleEntity;
	}
	
	public static RoleDto formDto(RoleEntity roleEntity) {
		RoleDto roleDto=new RoleDto();
		roleDto.setRoleId(roleEntity.getRoleId());
		roleDto.setRoleName(roleEntity.getRoleName());
		return roleDto;
	}
}
