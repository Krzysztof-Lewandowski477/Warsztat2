package src.pl.coderslab.controller;

import src.pl.coderslab.entity.Exercise;
import src.pl.coderslab.service.ExerciseService;

import java.util.Scanner;

public class ExerciseController {
    private final ExerciseService exerciseService;



    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    public void showMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcje");

        System.out.println("1 : Display all");
        System.out.println("2 : Display one");
        System.out.println("3 : Create exercise");
        System.out.println("4 : Update exercise ");
        System.out.println("5 : Delete exercise ");
        System.out.println("6 : powrót do menu");



    }




    public void displayAllExercise (Exercise[] findAll) {
       exerciseService.findAll();

    }

    public void displayOneExercise(Integer id){
        exerciseService.readById(id);

    }

    public void createExercise(Exercise exercise){

        exerciseService.create(exercise);
        return;
    }

    public void updateExercise(Exercise exercise){
        exerciseService.update(exercise);
    }

    public void deleteExercise(Integer id){
        exerciseService.delete(id);
    }
}
