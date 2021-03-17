package chapter2.dependencyinjection.users;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean usersHaveSameAddress(String user1, String user2) {
        return userDao.getAddress(user1).equals(userDao.getAddress(user2));
    }
}
