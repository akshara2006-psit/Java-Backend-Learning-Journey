package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
//import com.sun.tools.javac.util.List;

@Repository
public class UserDao 
{
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public boolean insertUser(User user) {
			boolean status=false;
			try {
				String INSERT_SQL_QUERY="INSERT into users VALUES(?,?,?,?)";
				int count=jdbcTemplate.update(INSERT_SQL_QUERY,user.getName(),user.getEmail(),user.getGender(),user.getCity());
				if(count>0) {
					status=true;
				}
				else {
					status=false;
				}
			}
			catch(Exception e) {
				status=false;
				e.printStackTrace();
			}
			return status;
			
		}
		public boolean updateUser(User user) {
			boolean status=false;
			try {
				String UPDATE_SQL_QUERY="UPDATE users SET name=?,gender=?,city=? where email=?";
				int count=jdbcTemplate.update(UPDATE_SQL_QUERY,user.getName(),user.getGender(),user.getCity(),user.getEmail());
				if(count>0) {
					status=true;
				}
				else {
					status=false;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public User getUserByemail(String email) {
			String SELECT_SQL_QUERY="SELECT * from users where email=?";
			return jdbcTemplate.queryForObject(SELECT_SQL_QUERY, new UserRowMapper(), email);
		}
		public List<User> getAllUsers(){
			String SELECT_SQL_QUERY="SELECT * from users";
			return jdbcTemplate.query(SELECT_SQL_QUERY, new UserRowMapper());
		}
		public static final class UserRowMapper implements RowMapper<User>{

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				return user;
			}
			
		}
}
