package nanol

/**
 * Some nanoL AST instances for testing.
 */
object NanoASTs {

  import NanoElement.*

  val a = NanoAtom("hello")

  val l = NanoList(
    NanoAtom("hello"),
    NanoAtom("world")
  )

  // TODO
  //  Using the algebraic data type defined above (NanoElement, NanoList, and NanoAtom),
  //  construct an AST for the nanoL expression
  //
  //    ( ( hello world ) ( what up ) )

  val e = ???
}
