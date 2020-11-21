package com.module.userInfoModule.userInfoModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.module.userInfoModule.userInfoModule.entity.RoleEntity;
import com.module.userInfoModule.userInfoModule.repository.RoleRepository;

/**
 * RoleServiceImpl which implements RoleService.
 * @author Kowshik Bharathi M
 */
@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository) {
	    super();	
		this.roleRepository=roleRepository;
	}

	private final RoleRepository roleRepository;
	
	@Override
	public RoleEntity save(RoleEntity roleEntity) {
		return RoleEntity.formEntity(roleRepository.save(RoleEntity.formDto(roleEntity)));
	}
}
 