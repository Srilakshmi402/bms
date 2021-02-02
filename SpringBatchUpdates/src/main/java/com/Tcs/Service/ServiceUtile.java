package com.Tcs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.Tcs.Dao.DaoUtile;
import com.Tcs.entity.Employe;

@Configuration
public class ServiceUtile {

	@Autowired
	private DaoUtile daoUtile;

	public int[] save(List<Employe> li) {
		int[] total = daoUtile.total(li);
		return total;

}
}
