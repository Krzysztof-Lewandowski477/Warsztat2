package pl.coderslab.controller;

import pl.coderslab.entity.User;
import pl.coderslab.service.UserService;
import pl.coderslab.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void showMenu(){
        System.out.println("Wybierz opcje");
        System.out.println("1 : Display all");
        System.out.println("2 : Display one");
        System.out.println("3 : Create user");
        System.out.println("4 : Update user ");
        System.out.println("5 : Delete user ");
        System.out.println("6 : powrót do menu");


        //  private User[] addToArray(User u, User[] users) {
        //        User[] tmpUsers = Arrays.copyOf(users, users.length + 1);
        //        tmpUsers[users.length] = u;
        //        return tmpUsers;
        //    }
    }

    public void displayAllUsers(){
//         public User read(int userId) {
//                try (Connection conn = DBUtil.getConnection()) {
//                    PreparedStatement statement = conn.prepareStatement(READ_USER_QUERY);
//                    statement.setInt(1, userId);
//                    ResultSet resultSet = statement.executeQuery();
//                    if (resultSet.next()) {
//                        User user = new User();
//                        user.setId(resultSet.getInt("id"));
//                        user.setUsername(resultSet.getString("username"));
//                        user.setEmail(resultSet.getString("email"));
//                        user.setPassword(resultSet.getString("password"));
//
//                        return user;
//                    }
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
    }

    public void displayOneUser(){

    }

    public void createUser(){

    }

    public void updateUser(){

    }

    public void deleteUser(){

    }
}
