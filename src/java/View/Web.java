/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import session.UserFacade;

/**
 *
 * @author Rob
 */
@Named
@RequestScoped
public class Web
{
	@EJB
	private UserFacade uf;
	
	private Integer userId;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private String address;

	/**
	 * @return the userId
	 */
	public Integer getUserId()
	{
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	/**
	 * @return the fName
	 */
	public String getfName()
	{
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName)
	{
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName()
	{
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName)
	{
		this.lName = lName;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void save(){
		try{
			uf.Save(userId, fName, lName, email, password, address);
		}catch (Exception ex)
		{
			
		}
	}
	
}
