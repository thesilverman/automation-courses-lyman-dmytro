package homeworks.Infrastructure.data;

public interface DataMapper {
    User findUserById(String id);
    User findUserByUserName(String name);
    User findUserByEmail(String email);
    User findUserByPassword(String password);
}


