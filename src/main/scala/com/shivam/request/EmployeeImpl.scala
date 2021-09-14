package com.shivam.request

import com.shivam.models.Employee
import com.shivam.validator.EmployeeValidator

class EmployeeImpl(employeeValidator: EmployeeValidator) {

  def createEmployee(employee: Employee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee)) Option(employee.emailId)
    else None
  }
}
