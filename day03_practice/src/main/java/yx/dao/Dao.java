package yx.dao;

import yx.entity.Team;

public interface Dao {
    void addTeam(Team team);

    int delete(int id);
}
