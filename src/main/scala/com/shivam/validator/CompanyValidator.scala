package com.shivam.validator

import com.shivam.db.CompanyReadDto
import com.shivam.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val companyData = new CompanyReadDto()
    for((key,value)<-companyData.companies){
      if(key==company.name)
        return true
    }
    return false
  }
}
