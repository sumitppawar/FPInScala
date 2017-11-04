def isSorted[T](as:Array[T],
                ordered: (T,T) => Boolean): Boolean  = {
    @annotation.tailrec
    def loop(i: Int, j:Int):Boolean =
      if(j >= as.length)
        true
      else if(ordered(as(i),as(j)))
        loop(i+1,j+1)
      else
        false
  loop(0,1)
}

isSorted[Int](Array(1,2,3,4,5,0), (a, b) => b>a)