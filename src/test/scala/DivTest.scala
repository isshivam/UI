import org.scalatest.flatspec.AnyFlatSpec

class DivTest extends AnyFlatSpec{

  it should "match" in {
    val obj = new que
    assert(obj.divide(10,2) == 5)
  }

}
