package src.pl.coderslab.controller;

import src.pl.coderslab.entity.User;
import src.pl.coderslab.service.UserService;

import java.util.Scanner;

public class UserController  {



    private   final UserService userService;



    public UserController(UserService userService) {
        this.userService = userService;
    }

    public static void showMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcje");
        System.out.println("1 : Display all");
        System.out.println("2 : Display one");
        System.out.println("3 : Create user");
        System.out.println("4 : Update user ");
        System.out.println("5 : Delete user ");
        System.out.println("6 : powrót do menu");
//        createUser(userService.create(user));
        scan.nextLine();


    }








    public  void displayAllUsers (User[] findAll , int i) {
        i=1;
        userService.findAll();


    }

    public void displayOneUser(Integer id ){
        userService.readById(id);

    }

    public void createUser(User user){

         userService.create(user);
         return;
    }

    public void updateUser(User user){
        userService.update(user);
    }

    public void deleteUser(Integer id){
        userService.delete(id);
    }
}

