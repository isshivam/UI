import com.shivam.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class emailTest extends AnyFlatSpec {
  "knoldus@gmail.com" should "be true" in {
    val mail = new EmailValidator
    val result = mail.emailIdIsValid(emailId = "knoldus@gmail.com")
    assert(result===true)
  }
}
