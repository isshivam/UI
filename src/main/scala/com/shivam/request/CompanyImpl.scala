package com.shivam.request

import com.shivam.models.Company
import com.shivam.validator.CompanyValidator

class CompanyImpl(companyValidator: CompanyValidator) {

  def createCompany(company: Company): Option[String] = {
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}
