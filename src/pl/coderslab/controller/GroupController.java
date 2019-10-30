package src.pl.coderslab.controller;

import src.pl.coderslab.entity.Group;
import src.pl.coderslab.service.GroupService;

import java.util.Scanner;

public class GroupController {
    private final GroupService groupService;



    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    public void showMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcje");

        System.out.println("1 : Display all");
        System.out.println("2 : Display one");
        System.out.println("3 : Create group");
        System.out.println("4 : Update group ");
        System.out.println("5 : Delete group ");
        System.out.println("6 : powrót do menu");



    }




    public void displayAllGroup (Group[] findAll) {
        groupService.findAll();

    }

    public void displayOneGroup(Integer id){
        groupService.readById(id);

    }

    public void createGroup(Group group){

        groupService.create(group);
        return;
    }

    public void updateGroup(Group group){
        groupService.update(group);
    }

    public void deleteGroup(Integer id){
        groupService.delete(id);
    }
}
