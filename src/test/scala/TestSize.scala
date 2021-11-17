package nanol

import org.scalatest.funsuite.AnyFunSuite

// DONE

class TestSize extends AnyFunSuite {

  test("size works for atom") {
    assert(size(NanoASTs.a) == 1)
  }

  test("size works for simple list") {
    assert(size(NanoASTs.l) == 2)
  }

  test("size works for complex list") {
    assert(size(NanoASTs.e) == 4)
  }
}
