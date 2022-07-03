package Departments;

public class hrDepartment extends superDepartment{

	public String DepartmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill's todays worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
