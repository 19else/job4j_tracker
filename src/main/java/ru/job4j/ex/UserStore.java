package ru.job4j.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rst = -1;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUserName(login).equals(login)) {
                rst = index;
                System.out.println("rst = " + rst + " Login = " + login);
                break;
            }
        }
     if (rst == -1) {
            throw new UserNotFoundException("User " + login + " not found");
        }
        return users[rst];
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rst = true;
         if (user.isValid() == false) {
            rst = false;
            throw new UserInvalidException("User " + user + " access denied");
        }
         String name = user.getUserName("SergeyEEE");
         int line = name.length();
        if(line < 3 ) {
            System.out.println("Name is " + name + " must be more then 3 symbols ");
        }
        return rst;
    }

    public static void main(String[] args) throws UserNotFoundException {

            User[] users = {
                    new User("Petr", true),
                    new User("Serge", true),
                    new User("AB", true),
                    new User("Anton", false)
            };

            User user = findUser(users, "Serge");
            User user1 = findUser(users, "AB");
            User user2 = findUser(users, "Anton");
            User user3 = findUser(users, "Kuzma");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
            try {
                validate(user3);
            } catch (UserNotFoundException un) {
                un.printStackTrace();
            }
            try {
                validate(user2);
            } catch (UserInvalidException ui) {
                ui.printStackTrace();
            }

            validate(user1);

     /**    catch (UserInvalidException e) {
            e.printStackTrace();
        }
          catch (UserNotFoundException ui) {
         ui.printStackTrace();
         }  **/
    }

}
