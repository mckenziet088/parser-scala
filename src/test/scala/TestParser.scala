package nanol

import org.scalatest.funsuite.AnyFunSuite

class TestParser extends AnyFunSuite {

  val prefix = "parser works for "

  test(prefix + NanoSources.i) {
    val result = NanoParser.parse(NanoParser.list, NanoSources.i)
    assert(result.successful)
    assert(result.get == NanoASTs.e) // omit this second assertion from the remaining tests below
  }

  test(prefix + NanoSources.h) {
    assert(NanoParser.parse(NanoParser.list, NanoSources.h).isEmpty) // example of an invalid source string
  }

  // TODO add tests for all remaining NanoSources - only assert successful or isEmpty (failure)
}
