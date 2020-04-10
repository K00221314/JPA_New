/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.User;

/**
 *
 * @author Rob
 */
@Stateless
public class UserFacade extends AbstractFacade<User>
{

	@PersistenceContext(unitName = "JPA_Test3PU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	public UserFacade()
	{
		super(User.class);
	}
	
	public void Save(Integer userId, String fName, String lName, String email, String password, String address){
		try{
			User user = new User(userId,  fName,  lName,  email,  password,  address);
			em.persist(user);
		}catch (Exception ex)
		{
			throw new EJBException(ex.getMessage());
		}
	}
}
