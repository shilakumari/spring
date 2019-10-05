package com.tutorial.spring.dataSupport._2usingSpringAndDataSourceConfiguration;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MyJdbcDaoSupportImpl extends JdbcDaoSupport {
	public int getCircleCount() {
		return this.getJdbcTemplate().queryForObject("Select count(*) from circle", Integer.class);
	}
}
