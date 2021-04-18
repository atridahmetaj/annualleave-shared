package com.annual.jeeshared.repository;


import com.annual.jeeshared.entity.User;
import com.annual.jeeshared.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByName(String name);

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

}
