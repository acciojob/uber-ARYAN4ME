package com.driver.services;

import java.util.List;

import com.driver.model.Admin;
import com.driver.model.Customer;
import com.driver.model.Driver;
import io.swagger.models.auth.In;

public interface AdminService {

	public void adminRegister(Admin admin);

	public Admin updatePassword(Integer adminId, String password);

	public void deleteAdmin(int adminId);

	public List<Driver> getListOfDrivers();
	
	public List<Customer> getListOfCustomers();
}
