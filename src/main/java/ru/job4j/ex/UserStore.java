package ru.job4j.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rst = -1;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUserName(login).equals(login)) {
                rst = index;
                System.out.println("rst = " + rst + " Login = " + login);
               // break;
            }
        }
     if (rst == -1) {
            throw new UserNotFoundException("User " + login + " not found");
        }
        return users[rst];
    }

    public static boolean validate(User user) throws UserInvalidException {
     //   boolean rst = true;
        String name = user.getUserName("SergeyEEE");
        int line = name.length();
         if (user.isValid() != true) {
           // rst = false;
            throw new UserInvalidException("User " + user + " access denied");
        }
        if(line < 3 ) {
            throw new UserInvalidException("User + " + name + " must be 3 symbols and more");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
            User[] users = {
                    new User("Petr", true),
                    new User("Serge", true),
                    new User("AB", true),
                    new User("Anton", false),
                    new User("Valentin", false)
            };
            User user = findUser(users, "Serge");
                if (validate(user)) {
                System.out.println("This user has an access");
            }
                try {
                    User[] usersCatch = {
                            new User("Valentin", false),
                            new User("XXX", false)
                    };
                    User usersA  = findUser(usersCatch, "Valentin");
                    User usersC = findUser(usersCatch, "XXX");
                 //   User usersB = findUser(usersCatch, "Stepan");
                    validate(usersA);
                    validate(usersC);
                } catch (UserNotFoundException ui) {
                    ui.printStackTrace();
                }
                catch (UserInvalidException un) {
                    un.printStackTrace();
                }
    /**    try {
            User user1 = findUser(users, "AB");
            validate(user1);
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        }
        try {
            User user3 = findUser(users, "Kuzma");
            validate(user3);
        } catch (UserNotFoundException un) {
                un.printStackTrace();
            }
        try {
            User user2 = findUser(users, "Anton");
            validate(user2);
        } catch (UserInvalidException ui) {
                ui.printStackTrace();
            } **/
    }
}
