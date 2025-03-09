package org.example.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.dao.entity.TestDaoTable1;
import org.example.dao.entity.TestDaoTable1Example;

public interface TestDaoTable1Mapper {
    long countByExample(TestDaoTable1Example example);

    int deleteByExample(TestDaoTable1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestDaoTable1 row);

    int insertSelective(TestDaoTable1 row);

    List<TestDaoTable1> selectByExample(TestDaoTable1Example example);

    TestDaoTable1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TestDaoTable1 row, @Param("example") TestDaoTable1Example example);

    int updateByExample(@Param("row") TestDaoTable1 row, @Param("example") TestDaoTable1Example example);

    int updateByPrimaryKeySelective(TestDaoTable1 row);

    int updateByPrimaryKey(TestDaoTable1 row);
}