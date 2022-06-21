package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Compras"));
		list.add(new Department(2, "Almoxarifado"));
		list.add(new Department(3, "Transporte"));
		list.add(new Department(4, "T.I."));
		list.add(new Department(4, "Secretaria"));
		
		return list;
		
	}

}
