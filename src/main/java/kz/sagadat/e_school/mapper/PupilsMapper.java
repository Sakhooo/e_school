package kz.sagadat.e_school.mapper;

import kz.sagadat.e_school.model.Pupils;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PupilsMapper {
    @Select("select * from pupils")
    List<Pupils> findAll();

    @Insert("insert into pupils(name,surname,age,sex,address) values(#{name},#{surname},#{age},#{sex},#{address})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",before = false,resultType = Long.class)
    void insert(Pupils pupils);

    @Update("update pupils set name=#{name}, surname=#{surname},age=#{age},sex=#{sex},address=#{address} where id=#{id}")
    void update(Pupils pupils);

    @Delete("delete from pupils where id=#{id}")
    void delete(int id);
}
