package src.pl.coderslab.service;

import src.pl.coderslab.dao.SolutionDao;

import src.pl.coderslab.entity.Solution;


public class SolutionService {
    private final SolutionDao solutionDao;

    public SolutionService(SolutionDao solutionDao) {
        this.solutionDao = solutionDao;
    }

    public Solution create(Solution solution){
        return solutionDao.create(solution);
    }

    public Solution readById(Integer id){
        return solutionDao.read(id);
    }

    public void update(Solution solution){
        solutionDao.update(solution);
    }

    public void delete(Integer id){
        solutionDao.delete(id);
    }
public Solution[] findAll() {return  solutionDao.findAll();}
    public Solution[] findAllByUserId(){
        return solutionDao.findAllByUserId();
    }

    public Solution[] findAllByExerciseId(){
        return solutionDao.findAllByExerciseId();
    }
}
