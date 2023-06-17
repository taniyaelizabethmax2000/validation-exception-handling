package com.javatechie.api.repository;

import com.javatechie.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
	User findByUserId(int id);

	//User findByName(String string);
}
