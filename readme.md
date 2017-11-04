## Functional Programming in Scala (Book Notes)
What is Referential Transparency (RT) ?
If a expression is replaced by its result then it is referential transparent.
Example 
val expr = 4+5
val result_2 =  10 + expr 
val result_1 =  10 + 9

result_1 and result_2 are equal, expr is RT

Pure function is also Referential Transparent.

###  Currying function give us better type inference.
```scala
//Without currying
def op[A](a:A, b:A,f:(A,A) => A) = f(a,b)
op(4,5, (a:Int, b:Int) => a+b) // OK
op(4,5, (a,b) => a+b) //Compilation Error Need to specify Type

//With Currying

def opWithCurry[A](a:A, b:A)(f:(A,A) => A) = f(a,b)
opWithCurry(4,5)( (a,b) => a+b) //Work without type
```


