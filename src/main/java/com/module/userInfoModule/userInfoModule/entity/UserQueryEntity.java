package com.module.userInfoModule.userInfoModule.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserQueryEntity which represent custom entity for User & Role table.
 * @author Kowshik Bharathi M
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryEntity{
	
	private String roleName;
    private UUID userId;
	private String userName;
}
