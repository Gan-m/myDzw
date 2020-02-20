package com.accp.dao;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;

=======
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
import com.accp.pojo.Artisan;
import com.accp.vo.q.ArtisanVo;

public interface ArtisanMapper {
    int deleteByPrimaryKey(String artisanid);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(String artisanid);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
    
<<<<<<< HEAD
    List<ArtisanVo> selectTX(@Param("aid") String aid);
=======
    List<Artisan> query();
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
}