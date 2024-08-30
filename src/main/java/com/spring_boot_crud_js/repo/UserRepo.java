package com.spring_boot_crud_js.repo;

import com.spring_boot_crud_js.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
