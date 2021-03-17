package chapter2.dependencyinjection.users;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    private UserService userService;

    @BeforeEach
    public void setup() {
        userService = new UserService(userDao);
    }

    @Test
    public void unequalAddresses() {
        when(userDao.getAddress("user1"))
                .thenReturn("address1");
        when(userDao.getAddress("user2"))
                .thenReturn("address2");

        assertThat(userService.usersHaveSameAddress("user1", "user2"))
                .isFalse();
    }

    @Test
    public void equalAddresses() {
        when(userDao.getAddress("user1"))
                .thenReturn("address1");
        when(userDao.getAddress("user2"))
                .thenReturn("address1");

        assertThat(userService.usersHaveSameAddress("user1", "user2"))
                .isTrue();
    }
}
