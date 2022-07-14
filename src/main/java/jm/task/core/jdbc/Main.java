package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Артём", "Томилин", (byte) 22);
        System.out.println("User с именем – Артём добавлен в базу данных");
        userService.saveUser("Кто нибудь 1", "Какая нибудь1", (byte) 1 );
//        System.out.println("User с именем – \"Кто нибудь 1\" добавлен в базу данных");
//        userService.saveUser("Кто нибудь 2", "Какая нибудь2", (byte) 2);
//        userService.getAllUsers().forEach(System.out::println);
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
//    }
    }
}
