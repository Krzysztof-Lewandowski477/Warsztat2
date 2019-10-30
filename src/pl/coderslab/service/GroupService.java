package src.pl.coderslab.service;

import src.pl.coderslab.dao.GroupDao;
import src.pl.coderslab.entity.Group;

public class GroupService {
    private final GroupDao groupDao;

    public GroupService(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    public Group create(Group group){
        return groupDao.create(group);
    }

    public Group readById(Integer id){
        return groupDao.read(id);
    }

    public void update(Group group){
        groupDao.update(group);
    }

    public void delete(Integer id){
        groupDao.delete(id);
    }

    public Group[] findAll(){
        return groupDao.findAll();
    }
}
