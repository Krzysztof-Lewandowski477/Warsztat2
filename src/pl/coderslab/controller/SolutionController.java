package src.pl.coderslab.controller;

import src.pl.coderslab.entity.Solution;

import src.pl.coderslab.service.SolutionService;

import java.util.Scanner;

public class SolutionController {
    private final SolutionService solutionService;



    public SolutionController(SolutionService solutionService) {
        this.solutionService = solutionService;
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




    public void displayAllSolution (Solution[] findAll) {
        solutionService.findAll();

    }

    public void displayOneSolution(Integer id){
        solutionService.readById(id);

    }

    public void createSolution(Solution solution){

        solutionService.create(solution);
        return;
    }

    public void updateSolution(Solution solution){
        solutionService.update(solution);
    }

    public void deleteSolution(Integer id){
        solutionService.delete(id);
    }
}
