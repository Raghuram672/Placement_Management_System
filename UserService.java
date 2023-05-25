package com.example.demo;

import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll(){
		return repo.findAll();
	}
	
	public void save(User user) {
		repo.save(user);
	}
	
	public User get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
