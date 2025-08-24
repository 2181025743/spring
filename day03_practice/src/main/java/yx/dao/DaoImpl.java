package yx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import yx.entity.Team;

@Repository
public class DaoImpl implements Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTeam(Team team) {
        String sql = "insert into team  (name,address) values (?,?)";
        int update = jdbcTemplate.update(sql, team.getName(), team.getAddress());
        System.out.println(update + "支球队已添加");
    }

    @Override
    public int delete(int id) {
        String sql = "delete from team where id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update + "支球队已删除");
        return update;
    }
}
