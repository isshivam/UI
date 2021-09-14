package com.shivam.validator

import com.shivam.models.Employee
import com.shivam.db.Employees

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val empName= new Employees
    for((key,value)<-empName.totalEmp){
      if( value == employee)
        return true
    }
    return false

  }
}

object checkEmployee{
  val emp2: Employee =  Employee("gaurav","singh",26,45000,"software developer","Knoldus","gauravsingh@knoldus.com")
  val obj = new EmployeeValidator()
  println(obj.employeeIsValid(emp2))
}

