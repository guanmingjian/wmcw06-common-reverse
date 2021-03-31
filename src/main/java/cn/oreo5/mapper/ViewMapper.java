package cn.oreo5.mapper;

import cn.oreo5.entity.PO.View;
import cn.oreo5.entity.PO.ViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewMapper {
    int countByExample(ViewExample example);

    int deleteByExample(ViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(View record);

    int insertSelective(View record);

    List<View> selectByExample(ViewExample example);

    View selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") View record, @Param("example") ViewExample example);

    int updateByExample(@Param("record") View record, @Param("example") ViewExample example);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);
}