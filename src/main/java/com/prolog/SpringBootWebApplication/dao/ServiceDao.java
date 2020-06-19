package com.prolog.SpringBootWebApplication.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.prolog.SpringBootWebApplication.beans.NewUser;

@Repository
@Transactional
public class ServiceDao {
	@PersistenceContext
	  EntityManager entityManager;

public void addUser(NewUser user) {
	 entityManager.persist(user);
  }
public NewUser findUser(String username, String password) {
	NewUser user=entityManager.find(NewUser.class,username);

	System.out.println(user);
	return user;
}
}

