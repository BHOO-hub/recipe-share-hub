package com.yesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yesh.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{

	public User findByEmail(String email);
	

}
