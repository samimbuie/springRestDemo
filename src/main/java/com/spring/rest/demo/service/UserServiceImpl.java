package com.spring.rest.demo.service;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.demo.model.UserModel;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final AtomicLong counter = new AtomicLong();

	private static List<UserModel> users;

	static {
		users = populateDummyUsers();
	}

	public void testDb() {
		String sql = "select * from EMPLOYEES";
		jdbcTemplate.query(sql, new ResultSetExtractor<Integer>() {
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					System.out.println(rsmd.getColumnName(i));
					System.out.println(rsmd.isAutoIncrement(i));
					System.out.println(rsmd.getColumnTypeName(i));
					System.out.println(rsmd.getColumnType(i));
					System.out.println(rsmd.getTableName(i));
				}
				return columnCount;
			}
		});
	}

	public List<UserModel> findAllUsers() {
		testDb();
		return users;
	}

	private static List<UserModel> populateDummyUsers() {
		List<UserModel> users = new ArrayList<UserModel>();
		users.add(new UserModel("123","abc"));
		users.add(new UserModel("234","cfr"));
		users.add(new UserModel("456","ubh"));
		users.add(new UserModel("789","oty"));
		return users;
	}

}
