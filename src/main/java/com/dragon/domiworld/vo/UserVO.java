package com.dragon.domiworld.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dragon.domiworld.vo.UserVO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name="USER_DOMIWORLD")
public class UserVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;	// id
	
	@Column
	private String password;	// password
	
	@Column
	private String email;	// email
	
	@Column
	private String name;	// name
	
}