import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class UserControllerTests {

    private UserController controller;

    private static final String validUserName = "a";
    private static final String validPassword = "b";

    Map<String, Object> model;

    @Before
    public void initTest() {
        controller = new UserController();
        IUserService userServiceMock = EasyMock.createMock(IUserService.class);
        controller.setUserService(userServiceMock);
    }

    @Test
    public void shouldLogInWithValidUserNameAndPassword(){
        EasyMock.expect(controller.login(validUserName, validPassword, model)).andReturn("redirect:home") ;
    }
}
