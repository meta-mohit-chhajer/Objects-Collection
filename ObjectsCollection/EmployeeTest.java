package com.metacube.ObjectsCollection;

import org.junit.*;
import java.util.*;

public class EmployeeTest {

	Set<Employee> s1;

	@Before
	public void init() {
		s1 = new TreeSet<>();
	}

	@Test
	public void sizeTest() {
		Employee e1 = new Employee(1, "A", "X");
		Employee e2 = new Employee(1, "B", "Y");
		s1.add(e1);
		s1.add(e2);
		Assert.assertEquals(1, Employee.sizeOfEmp(s1));
	}

	@Test(expected = AssertionError.class)
	public void emptySet() {
		Employee.sizeOfEmp(s1);
	}

	@Test
	public void sortbyidTest() {
		Employee e1 = new Employee(3, "A", "X");
		Employee e2 = new Employee(2, "B", "Y");
		Employee e3 = new Employee(1, "C", "Z");
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		Assert.assertEquals(1, s1.stream().findFirst().get().getEmp_id());
	}

	@Test
	public void sortbynameTest() {
		Employee e1 = new Employee(3, "B", "X");
		Employee e2 = new Employee(2, "D", "Y");
		Employee e3 = new Employee(1, "C", "Z");
		Employee e4 = new Employee(4, "A", "L");
		Employee e5 = new Employee(5, "E", "M");
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		Assert.assertEquals("A",Employee.sortbyname(s1).get(0).getName());

	}

}