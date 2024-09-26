package com.bridgelabz.springbootproject.Dao;

import com.bridgelabz.springbootproject.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
//    public List<User> findByName(String name);
//
//    public List<User> findByNameAndCity(String name, String city);
//
//    public List<User> findByNameOrCity(String name, String city);
//
//    @Query("select u from User u")
//    public List<User> getAllUsers();

    @Query("select u from User u where u.name =:n")
    public List<User> getByUserName(@Param("n") String name);

    @Query("select u from User u where u.name =:n and u.city =:c")
    public List<User> getByUserNameAndCity(@Param("n") String name,@Param("c") String city);

}
