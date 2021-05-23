package hotel.UserRepository;

import hotel.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
	List<User> findByRoleIgnoreCase(@Param("Role") String Role);

    User findByUserName(@Param("userName") String userName);
    
    User findById(@Param("Id") long Id);

	User findByPhone(@Param("Phone") String phone);  
	
}