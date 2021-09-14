import org.scalatest.flatspec.AnyFlatSpec

class FibTest extends AnyFlatSpec{

  it should "match" in {
    val obj = new que
    assert(obj.fib(6) == 13)
  }

}
//11235813