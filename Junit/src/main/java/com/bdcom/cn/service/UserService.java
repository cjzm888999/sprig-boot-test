package com.bdcom.cn.service;

import com.bdcom.cn.dao.UserRepository;
import com.bdcom.cn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    public UserRepository userRepository;
    public List<User> findUserByName(String name){
        return userRepository.findUserByName(name);
    }

    public User findUserById(int id){
        return userRepository.findUserById(id);
    }
    public int updateUser(String email,String name,int id){
        return userRepository.updateUser(email,name,id);
    }
    public int updateUserEmail(String email,int id){
        return userRepository.updateUserEmail(email,id);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
