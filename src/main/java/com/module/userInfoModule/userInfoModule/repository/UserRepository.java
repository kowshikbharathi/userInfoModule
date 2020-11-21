package com.module.userInfoModule.userInfoModule.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.module.userInfoModule.userInfoModule.dto.UserDto;
import com.module.userInfoModule.userInfoModule.entity.UserQueryEntity;

/**
 * UserRepository repository for User table.
 * @author Kowshik Bharathi M
 */
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserDto, UUID>, JpaSpecificationExecutor<UserDto>{

	 UserDto findByUserName(String userName);
	 
	 @Query("SELECT new com.module.userInfoModule.userInfoModule.entity.UserQueryEntity(r.roleName,u.userId,u.userName) FROM RoleDto r JOIN r.users u WHERE u.userName= :userName")	
	 public UserQueryEntity getUserIdByName(String userName);
}


