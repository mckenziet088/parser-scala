package nanol

/**
 * Some valid and invalid nanoL source strings for testing.
 */
object NanoSources {

/*
 A. (hello (world what ()) (up))
 B. (hello world what up)
 C. (hello)
 D. the empty string
 E. ( ( ( ) ) ( ) )
 F. ("hello" "world" "what" "up")
 G. ( ( ) ) ( ) )
 H. hello
 I. ( ( hello world ) ( what up ) )
*/

  val h = "hello"
  val i = "( ( hello world ) ( what up ) )"

  // TODO define named constants a-g for each of the strings above

  // val a = "(hello (world what ()) (up))"
  // etc.
}
