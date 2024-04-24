package com.kaique.crud.repository;
import com.kaique.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, Long> {
}
