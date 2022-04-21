package com.torryharris.JdbcApp;

public class Employee {
private int empId;
private String empName;
private String department;
public Employee() {
super();
// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, String department) {
super();
this.empId = empId;
this.empName = empName;
this.department = department;
}
/**
* @return the empId
*/
public int getEmpId() {
return empId;
}
/**
* @param empId the empId to set
*/
public void setEmpId(int empId) {
this.empId = empId;
}
/**
* @return the empName
*/
public String getEmpName() {
return empName;
}
/**
* @param empName the empName to set
*/
public void setEmpName(String empName) {
this.empName = empName;
}
/**
* @return the department
*/
public String getDepartment() {
return department;
}
/**
* @param department the department to set
*/
public void setDepartment(String department) {
this.department = department;
}
@Override
public String toString() {
return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
}
}
