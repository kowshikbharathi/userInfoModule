package com.module.userInfoModule.userInfoModule.dto;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserDto represent user table.
 * 
 * @author Kowshik Bharathi M
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_tb")
public class UserDto implements Serializable {

	@Id
	@Column(name="user_id",columnDefinition = "VARCHAR(200)",insertable = false, updatable = false, nullable = false)
	@Type(type="uuid-char")
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid",strategy = "uuid2")
	private UUID userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="role_id")
	@Type(type="uuid-char")
	private UUID roleId;
	@Column(name="last_update_user_id")
	private String lastUpdateUserId;
	@Column(name="last_update_date_time")
	private Date lastUpdateDateTime;
	
	
	
	
}
