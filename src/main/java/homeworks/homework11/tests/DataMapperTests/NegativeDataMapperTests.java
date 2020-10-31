package homeworks.homework11.tests.DataMapperTests;

import homeworks.Infrastructure.data.DataMapper;
import homeworks.Infrastructure.data.FileDataMapper;
import homeworks.Infrastructure.data.User;
import homeworks.Infrastructure.data.UserNotFoundExсeption;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NegativeDataMapperTests {

    private DataMapper mapper;

    @Rule
    public ExpectedException ex = ExpectedException.none();

    @Test
    public void findUserEmailTests(){
        ex.expectMessage("can't find user with user1666@gmail.com");
        ex.expect(UserNotFoundExсeption.class);
        mapper = new FileDataMapper();
        User expectedUser = new User("1", "user1", "user1@gmail.com", "11111qwer");
        User actualUser = mapper.findUserByEmail("user1@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }

}
