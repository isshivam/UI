package com.shivam.db

import com.shivam.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("philips", "philips123@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "philips" -> philipsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
