package ru.job4j.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rst = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUserName().equals(login)) {
                rst = users[index];
                System.out.println("rst = " + rst + " Login = " + login);
            }
        }
        if (rst == null) {
            throw new UserNotFoundException("User " + login + " not found");
        }
        return rst;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User " + user + " access denied");
        }
        if (user.getUserName().length() < 3) {
            throw new UserInvalidException("User + " + user.getUserName()
                    + " must be 3 symbols and more");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr", true),
                new User("Serge", true),
                new User("AB", true),
                new User("Anton", false),
        };
        User user = findUser(users, "Serge");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        User[] usersCatch = {
                new User("Valentin", false),
                new User("XXX", false)
        };

        try {
            User usersA = findUser(usersCatch, "Valentin");
            if (validate(usersA)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println(ui.getMessage());
        } catch (UserNotFoundException un) {
            System.out.println(un.getMessage());
        }

        try {
            User usersB = findUser(usersCatch, "Valentin");
            if (validate(usersB)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println(ui.getMessage());
        } catch (UserNotFoundException un) {
            System.out.println(un.getMessage());
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
