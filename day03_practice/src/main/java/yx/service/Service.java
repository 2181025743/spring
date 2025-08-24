package yx.service;

import yx.entity.Team;

public interface Service {
    void registerTeam(Team team);

    void removeTeam(int id);
}
