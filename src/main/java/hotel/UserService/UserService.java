package hotel.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream:src/main/java/hotel/UserService/UserService.java

=======
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
>>>>>>> Stashed changes:src/main/java/hotel/Service/UserService.java
import hotel.User;
import hotel.UserRepository.UserRepository;
import hotel.dto.CreateUserRequest;

public class UserService {
	
	@Autowired
<<<<<<< Updated upstream:src/main/java/hotel/UserService/UserService.java
	private final static UserRepository userRepository;
=======
	static UserRepository userRepository;
>>>>>>> Stashed changes:src/main/java/hotel/Service/UserService.java
	
	userRepository = new UserRepository();
	
	public static void createUser(CreateUserRequest request){
		User user = new User(request.getPhone(), request.getPassword(), request.getFirstName(), request.getLastName(), request.getRole());
        userRepository.save(user);
	}
	
	public static User findUserById(long id){
		User user = userRepository.findById(id);
		return user;
	}
	
	public static User findUserByPhone(String phone){
		User user = userRepository.findByPhone(phone);
		return user;
	}
	
	public static List<User> findAll(){
		List<User> userList = userRepository.findAll();
		return userList;
	}
	
}
