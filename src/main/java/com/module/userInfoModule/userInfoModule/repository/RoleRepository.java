package com.module.userInfoModule.userInfoModule.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.module.userInfoModule.userInfoModule.dto.RoleDto;

/**
 * RoleRepository repository for Role table.
 * @author Kowshik Bharathi M
 */
@Repository
@EnableJpaRepositories
public interface RoleRepository extends  JpaRepository<RoleDto, UUID>{

	
}
