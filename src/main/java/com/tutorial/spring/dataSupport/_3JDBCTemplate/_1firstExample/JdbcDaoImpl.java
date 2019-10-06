package com.tutorial.spring.dataSupport._3JDBCTemplate._1firstExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {

	@Autowired
	DataSource dataSource2;

	JdbcTemplate jdbcTemplate = new JdbcTemplate();

	@Autowired
	JdbcTemplate jdbcTemplate2;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public int getCircleCount() {
		int circleCount = 0;
		Connection con = null;
		try {
			con = dataSource2.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT count(*) AS countCircle FROM circle");

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// circleCount = rs.getInt("1");
				circleCount = rs.getInt("countCircle");
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}

		return circleCount;
	}

	public int getCircleCountUsingJdbcTemplate() {
		int circleCount = 0;
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource2);
		String sqlQuery = "SELECT count(*) AS countCircle FROM circle";
		circleCount = jdbcTemplate.queryForObject(sqlQuery, Integer.class);
		return circleCount;
	}

	public int getCircleCountUsingJdbcTemplate2() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource2);
		return jdbcTemplate.queryForObject("SELECT count(*) AS countCircle FROM circle", Integer.class);
	}

	public int getCircleCountUsingJdbcTemplate3() {
		jdbcTemplate.setDataSource(dataSource2);
		return jdbcTemplate.queryForObject("SELECT count(*) AS countCircle FROM circle", Integer.class);
	}

	public int getCircleCountUsingJdbcTemplate4() {
		return jdbcTemplate.queryForObject("SELECT count(*) AS countCircle FROM circle", Integer.class);
	}

	public int getCircleCountUsingJdbcTemplate5() {
		return jdbcTemplate2.queryForObject("SELECT count(*) AS countCircle FROM circle", Integer.class);
	}

	public int getCircleCountUsingJdbcTemplate6() {
		String sqlQuery = "SELECT count(*) AS countCircle FROM circle";
		return jdbcTemplate2.queryForObject(sqlQuery, Integer.class);
	}

	// @Autowired
	public void setDataSource2(DataSource dataSource2) {
		jdbcTemplate.setDataSource(dataSource2);
		this.dataSource2 = dataSource2;
	}
	
	public String getCircleNameUsingJdbcTemplate(int id) {
		String sqlQuery = "SELECT name FROM circle where id=?";
		return jdbcTemplate2.queryForObject(sqlQuery, new Object[] { id }, String.class);
	}

	
	
	
	public void createTriangle() {
		String sqlQuery = "CREATE TABLE TRIANGLE2 (ID INTEGER,NAME VARCHAR(55))";
		jdbcTemplate2.execute(sqlQuery);
	}

	public void insertCircle(Circle circle) {
		String sqlQuery = "insert into circle values(?,?)";
		jdbcTemplate2.update(sqlQuery, new Object[] { circle.getId(), circle.getName() });
	}

	
	
	
	
	
	
	
	public Circle getCircleForId(int id) {
		String sqlQuery = "SELECT * FROM circle where id=?";
		return jdbcTemplate2.queryForObject(sqlQuery, new Object[] { id }, new CircleMapper());
	}

	// Implementing RowMapper interface to get Circle name, id.
	// Here when resultSet will have multiple rows then using rowNum we can
	// manipulate and get particular row.
	private static final class CircleMapper implements RowMapper<Circle> {
		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("id"));
			circle.setName(resultSet.getString("name"));
			return circle;
		}

	}

	public List<Circle> getAllCircles() {
		String sqlQuery = "SELECT * FROM circle";
		return jdbcTemplate2.query(sqlQuery, new CircleMapper());
	}

	public List<Circle> getAllCircles(int id, String name) {
		String sqlQuery = "SELECT * FROM circle where id=:circleId and name=:circleName";
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("circleId", id).addValue("circleName", name);
		return namedParameterJdbcTemplate.query(sqlQuery, sqlParameterSource, new CircleMapper());
	}
}
