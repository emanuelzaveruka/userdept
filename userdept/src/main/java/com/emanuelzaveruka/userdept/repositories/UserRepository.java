package com.emanuelzaveruka.userdept.repositories;

import com.emanuelzaveruka.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
