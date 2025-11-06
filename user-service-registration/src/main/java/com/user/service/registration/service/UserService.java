package com.user.service.registration.service;

import com.user.service.registration.entity.User;
import com.user.service.registration.exception.UserNotFoundException;
import com.user.service.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Integer id){
      Optional<User> user= userRepository.findById(id);

      if(user.isPresent()){
          return user.get();
      }
        throw new UserNotFoundException("user not found with id:"+id+"please try with different user id");
    }
}
