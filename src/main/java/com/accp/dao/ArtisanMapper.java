package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Artisan;
import com.accp.vo.q.ArtisanVo;

public interface ArtisanMapper {
    int deleteByPrimaryKey(String artisanid);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(String artisanid);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
    
    List<ArtisanVo> selectTX(@Param("aid") String aid);
    
    List<Artisan> query();
}