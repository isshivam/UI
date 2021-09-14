object email {

  def isValid(email: String): Boolean = if("""^[-a-zA-Z0-9]+(\.[-a-z0-9]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(com|net|org|[a-z][a-z])$""".r.findFirstIn(email) == None)false else true

  //def isValid REGEX ->  /[A-Za-z-._0-9]{1,}@[A-Za-z0-9]{1,}[.][net|org|com]{3}/

}

