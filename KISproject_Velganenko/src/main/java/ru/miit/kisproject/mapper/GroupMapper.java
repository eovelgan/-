package ru.miit.kisproject.mapper;

import java.util.List;
import ru.miit.kisproject.model.Groups;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into groups (group_name, group_id)",
        "values (#{groupName,jdbcType=VARCHAR}, #{groupID,jdbcType=VARCHAR})"
    })
    int insert(Groups row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "group_name, group_id",
        "from tdma.groups"
    })
    @Results({
        @Result(column="group_name", property="groupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupID", jdbcType=JdbcType.VARCHAR)
    })
    List<Groups> selectAll();
}