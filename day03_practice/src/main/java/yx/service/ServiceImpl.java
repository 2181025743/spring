package yx.service;

import org.springframework.beans.factory.annotation.Autowired;
import yx.dao.Dao;
import yx.entity.Team;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Dao dao;

    @Override
    public void registerTeam(Team team) {
        dao.addTeam(team);
    }

    @Override
    public void removeTeam(int id) {
        dao.delete(id);
    }
}
