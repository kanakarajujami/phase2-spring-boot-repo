package com.nt.repository;

import com.nt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {


    @Override
    void flush();
}

