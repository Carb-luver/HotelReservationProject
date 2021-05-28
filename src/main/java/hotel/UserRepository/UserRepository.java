package hotel.UserRepository;

import hotel.User;
import hotel.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
	List<User> findByRoleIgnoreCase(@Param("Role") UserRole role);

    User findByUserName(@Param("userName") String userName);
    
    User findById(@Param("Id") long Id);

	User findByPhone(@Param("Phone") String phone);  
	
}