package com.abir.users.repos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.abir.users.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}
