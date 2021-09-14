package com.shivam.validator

import com.shivam.db.CompanyReadDto

class EmailValidator {
  def emailIdIsValid(emailId: String): Boolean = {
    if("""^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(com|edu|mobi|net|org|[a-z][a-z])$""".r.findFirstIn(emailId) == null)  false
    else
      true
  }
  def checkMail(emailId: String): Boolean = {
    val companyData= new CompanyReadDto()
    for((key,value)<-companyData.companies){
      if( value.emailId == emailId )
        return true
    }
    return false
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    val mail = new EmailValidator
    println(mail.emailIdIsValid("shivamrai0307@gmail.com"))
    println(mail.checkMail("gauravsingh@gmail.com"))
  }
}