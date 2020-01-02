package com.accp.dao;

import com.accp.pojo.Artisan;

public interface ArtisanMapper {
    int deleteByPrimaryKey(String artisanid);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(String artisanid);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}