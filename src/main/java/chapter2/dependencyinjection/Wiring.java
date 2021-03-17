package chapter2.dependencyinjection;

import chapter2.dependencyinjection.circular.Root;
import chapter2.dependencyinjection.users.UserService;

public class Wiring {

    public static void main(String[] args) throws Exception {
        var autowirer = new Autowirer();
        UserService userService = autowirer.getInstance(UserService.class);
        System.out.println(userService);

        autowirer.getInstance(Root.class);
    }
}

/*
         UserService
              |
              v
           UserDao
          /       \
         v         v
    DummyDep1   DummyDep2
          \       /
           v     v
          DummyDep3
 */

/*
          Root
           |
           v
         Child1 <--------
           |             |
           v             |
         Child2 -----> Child3
 */
