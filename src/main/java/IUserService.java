public interface IUserService {
    User authenticateUser(String username, String password) throws DatabaseConnectionException,
            NoSearchResultException, InvalidPasswordException;
}

