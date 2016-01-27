import java.util.Map;

public class UserController {

    private IUserService userService;

    public void setUserService(IUserService userServiceMock) {
        this.userService = userService;
    }

    public String login(String username, String password, Map<String, Object> model) {
        try {
            User userToLogin = userService.authenticateUser(username, password);
            model.put("user", userToLogin);
            return "redirect:home";
        } catch (DatabaseConnectionException e) {
            model.put("errorMessage", e.getMessage());
            return "index";
        } catch (NoSearchResultException e) {
            model.put("errorMessage", e.getMessage());
            return "index";
        } catch (InvalidPasswordException e) {
            model.put("errorMessage", e.getMessage());
            return "index";
        }
    }
}
