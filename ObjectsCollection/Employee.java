package com.metacube.ObjectsCollection;

import java.util.*;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee> {
	public int emp_id;
	public String name;
	public String Address;

	public Employee(int emp_id, String name, String Address) {
		this.emp_id = emp_id;
		this.name = name;
		this.Address = Address;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getEmp_id() == o.getEmp_id()) {
			return 0;
		}
		return this.getEmp_id() > o.getEmp_id() ? 1 : -1;
	}

	@Override
	public int hashCode() {
		return this.getEmp_id();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.getEmp_id() == e1.getEmp_id()
				&& this.getName() == e1.getName()
				&& this.getAddress() == e1.getAddress()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee [emp_id= " + emp_id + ", name= " + name
				+ ", Address= " + Address + " ]";
	}

	public static int sizeOfEmp(Set<Employee> s1)
	{
		if(s1.size()==0)
			throw new AssertionError("Empty Set");
		return s1.size();
	}
	/*
	 * Function to Sort According to Emp_Id
	 * @return Set<Employee> of Employee
	 */
	public static Set<Employee> sortbyid(Set<Employee> s1) {
		
		return s1;
	}

	/*
	 * Function to Sort According to Name
	 * @return Set<Employee> of Employee
	 */
	public static List<Employee> sortbyname(Set<Employee> s1) {
		List<Employee> list = s1.parallelStream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println("Sorted By name");
		return list;

	}

	public static void main(String... arg) {
		Set<Employee> s1 = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "B", "Jodhpur");
		Employee e2 = new Employee(1, "G", "Jaipur");
		Employee e3 = new Employee(2, "A", "Barmer");
		Employee e4 = new Employee(3, "D", "Jaisalmer");
		Employee e5 = new Employee(4, "C", "Pokaran");
		Employee e6 = new Employee(5, "M", "XXXX");
		Employee e7 = new Employee(3, "L", "XXXXY");
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		s1.add(e6);
		s1.add(e7);
		System.out.println("Emp Size " + s1.size());
		System.out.println(Employee.sortbyid(s1));
		System.out.println(Employee.sortbyname(s1));

	}
}
