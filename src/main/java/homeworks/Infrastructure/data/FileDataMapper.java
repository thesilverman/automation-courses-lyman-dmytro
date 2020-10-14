package homeworks.Infrastructure.data;

import java.io.*;

public class FileDataMapper implements DataMapper {
    User[] users = new User[9];

    public FileDataMapper() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))){
            String rb = null;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User(splitedUser[0], splitedUser[1], splitedUser[2], splitedUser[3]);
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

    class reader implements AutoCloseable {

        @Override
        public void close() throws Exception {
            
        }
    }

    public User[] getAll() {
        return users;
    }

    @Override
    public User findUserById(String id) {
        try {
            for (User user : users) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Данный id не найден!");
        }
        return null;
    }

    @Override
    public User findUserByUserName(String name) {
        try {
            for (User user : users) {
                if (user.getUserName().equals(name)) {
                    return user;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Данный юзер не найден!");
        }
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        try {
            for (User user : users) {
                if (user.getUserEmail().equals(email)) {
                    return user;
                }
            }
        } catch (NullPointerException c) {
            System.out.println("Данный email не найден!");
        }
        return null;
    }

    @Override
    public User findUserByPassword (String password){
        try {
            for (User user : users) {
                if (user.getUserPassword().equals(password)) {
                    return user;
                }
            }
        } catch (NullPointerException b) {
            System.out.println("Данный пароль не найден!");
        }
        return null;
    }

}