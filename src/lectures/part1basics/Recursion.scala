package lectures.part1basics

object Recursion extends App {
def factorial(n:BigInt):BigInt = {
  if(n <= 1) 1
  else {
    print("computing factorial of "+ n +"- I need factorial of "+ (n-1) )
    val result = n * factorial(n - 1)
    print("computed factorial of "+ n)
    result
  }

}
  println(factorial(5000))
}
