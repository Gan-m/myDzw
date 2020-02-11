package com.accp.dao;

import java.util.List;

import com.accp.pojo.Team;
import com.accp.vo.o.Team_artisan;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer teamid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
    
    List<Team> query();//父班组
    
    List<Team_artisan> queryTeam_artisan();//两表查询、班组及技工详情
    
    List<Team> queryBanZu();//班组
    
    List<Team> queryBanZuByid(Integer fteamid);//班组带条件
    
}