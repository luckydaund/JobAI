package com.jobai.jobai.dto;

public class UserResponseDTO {

	private Integer userId;
	private String name;
	private String email;
	private String phone;
	private String status;
	private String roleName;
	public UserResponseDTO() {
		super();
	}
	public UserResponseDTO(Integer userId, String name, String email, String phone, String status, String roleName) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.status = status;
		this.roleName = roleName;
	}
	
	public Integer getUserId()
	{
		return  userId;
	}
	
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getRoleName()
	{
		return roleName;
	}
	
	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}
}
