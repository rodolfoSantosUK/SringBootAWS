package  com.rasmoo.cliente.escola.gradecurricular.service ;

import com.rasmoo.cliente.escola.gradecurricular.shared.dto.UserDto;
import java.util.List;

public interface UserService {
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String userId, UserDto user);
	void deleteUser(String userId);
	List<UserDto> getUsers(int page, int limit);
	boolean verifyEmailToken(String token);
	boolean requestPasswordReset(String email);
	boolean resetPassword(String token, String password);
}
