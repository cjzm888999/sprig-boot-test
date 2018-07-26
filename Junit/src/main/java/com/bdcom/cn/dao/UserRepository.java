package com.bdcom.cn.dao;

import com.bdcom.cn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findUserByName(String name);
    public User findUserById(int id);
    @Modifying
    @Transactional
    @Query(value="update User set email=:email,name=:name where id=:id" , nativeQuery=true )
    public int updateUser(@Param("email") String mail,@Param("name") String name, @Param("id") int id);

    @Modifying
    @Transactional
    @Query(value="update User set email=:email where id=:id" , nativeQuery=true )
    public int updateUserEmail(@Param("email") String email, @Param("id") int id);
}
