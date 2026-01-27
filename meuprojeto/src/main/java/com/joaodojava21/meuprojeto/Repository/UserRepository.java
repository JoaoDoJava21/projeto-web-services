package com.joaodojava21.meuprojeto.Repository;

import com.joaodojava21.meuprojeto.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long> {
}
