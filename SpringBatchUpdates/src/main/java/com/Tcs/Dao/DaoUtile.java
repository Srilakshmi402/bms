package com.Tcs.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Tcs.entity.Employe;

@Configuration
public class DaoUtile {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int[] total(List<Employe> list) {

		String sql = "insert into emp_table values(?,?,?)";
		return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {

				Employe employe = list.get(i);
				ps.setInt(1, employe.getEno());
				ps.setString(2, employe.getName());
				ps.setDouble(3, employe.getSalary());

			}

			@Override
			public int getBatchSize() {
				return list.size();
			}
		});

	}
}
