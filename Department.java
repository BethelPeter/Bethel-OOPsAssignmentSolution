package Departments;

public class Department {

	public static void main(String args[]) {
		
		hrDepartment hr = new hrDepartment();
		techDepartment tech = new techDepartment();
		adminDepartment admin = new adminDepartment();
		
		System.out.println("Welcome to " + admin.DepartmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		
		System.out.println();
		System.out.println("Welcome to " + hr.DepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		System.out.println();
		System.out.println("Welcome to " + tech.DepartmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());


	}
}
