package homeworks.homework11.tests.DataMapperTests;

import homeworks.Infrastructure.data.DataMapper;
import homeworks.Infrastructure.data.FileDataMapper;
import homeworks.Infrastructure.data.User;
import org.junit.Assert;
import org.junit.Test;

public class PositiveDataMapper {
    private DataMapper mapper;

    @Test
    public void findUserEmailTests(){
        mapper = new FileDataMapper();
        User expectedUser = new User("1", "user1", "user1@gmail.com", "11111qwer");
        User actualUser = mapper.findUserByEmail("user1@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }

    @Test
    public void findUserNameTests(){
        mapper = new FileDataMapper();
        User expectedUser = new User("5", "user5", "user5@gmail.com", "55555qwer");
        User actualUser = mapper.findUserByEmail("user5@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }

}
