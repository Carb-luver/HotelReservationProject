package hotel.Service;

import org.springframework.web.bind.annotation.PathVariable;

import hotel.User;
import hotel.UserRole;

public class PermissionService {
	
	public boolean isAuthenticated(@PathVariable long userId){
		User user = UserService.findUserById(userId);
		if(user.getRole() == UserRole.ADMINISTRATOR){
			return true;
		}else{
			return false;
		}
	}
}
