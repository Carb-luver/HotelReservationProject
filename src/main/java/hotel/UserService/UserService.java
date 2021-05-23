package hotel.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hotel.User;
import hotel.UserRepository.UserRepository;

public class UserService {
	
	@Autowired
	private final static UserRepository userRepository;
	
	userRepository = new UserRepository();
	
	public static void createUser(User user){
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
