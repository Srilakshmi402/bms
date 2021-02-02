package com.Tcs.SpringBatchUpdates;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Tcs.Service.ServiceUtile;
import com.Tcs.Utile.MocUtile;
import com.Tcs.entity.Employe;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtile.class);
//		JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
		
//		String[] sql = new String[3];
//		sql[0] = "insert into emp_table values(10,'vasathi',522020)";
//		sql[1] = "insert into emp_table values(20,'bitra',251555)";
//		sql[2] = "insert into emp_table values(32,'kalyan',25156)";
//
//		int[] update = jdbcTemplate.batchUpdate(sql);
//
//		for (int i : update) {
//			System.out.println(i);
//		}

		Employe employe1 = new Employe();
		employe1.setEno(20);
		employe1.setName("sri lakshmi");
		employe1.setSalary(500000d);

		Employe employe2 = new Employe();
		employe2.setEno(30);
		employe2.setName("akurathi");
		employe2.setSalary(456255d);

		ArrayList<Employe> arrayList = new ArrayList<Employe>();
		arrayList.add(employe1);
		arrayList.add(employe2);

		ServiceUtile serviceUtile = container.getBean(ServiceUtile.class);
		int[] save = serviceUtile.save(arrayList);
		for (int i : save) {
			System.out.println(i);
		}
	}
}
