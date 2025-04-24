package com.sridhar.infinitystream.repository;



import com.sridhar.infinitystream.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);   // OK
    boolean existsByUserName(String userName);        // Fix: not 'username'
}
