package src.pl.coderslab;

import src.pl.coderslab.controller.UserController;
import src.pl.coderslab.service.UserService;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World!");






        //TODO : menu główne

        System.out.println("Czym chcesz zarządzac ? ");
        System.out.println("1 Użytkownikami ");
        System.out.println("2 Grupami");
        //TODO : wczytać i użyć kontrollera odpowiedniego
        Scanner scann1 = new Scanner(System.in);
        while(!scann1.hasNextInt()){
            System.out.println("Podaj liczbę wyboru");


        }

        UserController user = new UserController().showMenu();

    }
}
