package co.kr.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import co.kr.mybatis.dto.post;
import co.kr.mybatis.dto.postList;

@Mapper
public interface boardMapper {

	@Select("select count(*) from post")
	int getboardcount();

	@Insert("INSERT INTO `board`.`post` (`cate`, `title`, `contents`, `userid`, `id`, `date`) "
			+ "VALUES (#{cate}, #{title}, #{contents}, #{userid}, #{id}, #{date})")
	int insertpost(post post);

	@Delete("delete from post where date = #{date}")
	int deletepost(String date);

	@Update("update post set cate =#{cate}, title =#{title}, contents =#{contents} where id =#{id}")
	int updatepost(@Param("cate") String cate, @Param("title") String title, @Param("contents") String contents,
			@Param("id") String id);

	@Select("select * from post order by idpost desc limit #{firstrow}, #{endrow}")
	List<post> selectedPost(@Param("firstrow") int firstrow, @Param("endrow") int endrow);

	@Select("select * from post where idpost = #{idpost}")
	post selecPost(@Param("idpost") int idpost);

	@Select("select count(*) from user where id = #{loginid} and pw =#{loginpw}")
	int logint(@Param("loginid") String loginid, @Param("loginpw") String loginpw);

}
