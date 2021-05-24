package hotel.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hotel.User;
import hotel.Repository.UserRepository;
import hotel.dto.CreateUserRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserService {
	
	static UserRepository userRepository;
	
	public static User createUser(CreateUserRequest request){
		User user = new User(request.getPhone(), request.getPassword(), request.getFirstName(), request.getLastName(), request.getRole());
        userRepository.save(user);
        return user;
	}
	
	public static User updateUser(User user){
        userRepository.save(user);
        return user;
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
