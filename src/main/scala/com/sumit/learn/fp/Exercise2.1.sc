def bif(n: Int) : Int = {
  @annotation.tailrec
  def bifHelper(n: Int, a: Int, b:Int): Int =
    if( n == 1)  a else bifHelper(n-1, b, b+a)
  bifHelper(n,0,1)
}
bif(7)