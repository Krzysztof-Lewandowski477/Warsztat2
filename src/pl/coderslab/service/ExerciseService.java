package src.pl.coderslab.service;

import src.pl.coderslab.dao.ExerciseDao;

import src.pl.coderslab.entity.Exercise;


public class ExerciseService {
    private final ExerciseDao exerciseDao;

    public ExerciseService(ExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    public Exercise create(Exercise exercise){
        return exerciseDao.create(exercise);
    }

    public Exercise readById(Integer id){
        return exerciseDao.read(id);
    }

    public void update(Exercise exercise){
        exerciseDao.update(exercise);
    }

    public void delete(Integer id){
        exerciseDao.delete(id);
    }

    public Exercise[] findAll(){
        return exerciseDao.findAll();
    }
}
