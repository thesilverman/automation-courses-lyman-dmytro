package homeworks.Infrastructure.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataMapper implements DataMapper {
    List<User> users = new ArrayList<>();

    public FileDataMapper() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String rb = null;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");

                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i) == null) {
                        users.add(i, new User(splitedUser[0], splitedUser[1], splitedUser[2], splitedUser[3]));
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAll()  {
        return users;
    }

    @Override
    public User findUserById(String id) {
        for (User user : users) {
            if (user != null && user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findUserByUserName(String name) {
        for (User user : users) {
            if (user != null && user.getUserName().equals(name)) {
                return user;
            }
        }
        throw new UserNotFoundExсeption(String.format("can't find user with %s", name));
    }

    @Override
    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getUserEmail().equals(email)) {
                return user;
            }
        }
        throw new UserNotFoundExсeption(String.format("can't find email with %s", email));
    }

    @Override
    public User findUserByPassword(String password) {
        for (User user : users) {
            if (user.getUserPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}