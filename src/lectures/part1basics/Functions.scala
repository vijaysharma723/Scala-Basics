package lectures.part1basics

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper

object Functions extends App {

  //Function with parameter
  def aFunction(a: String,b: Int) = {
    a + " " + b
  }
  println(aFunction("hello",3))

  //Functionless parameter
  def aParameterLessFunction() = 42

  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String,n: Int):String = {
  if(n == 1) aString
  else aString + aRepeatedFunction(aString,n-1)
  }

  println(aRepeatedFunction("hello",3))

  def aGreetingFunction(name: String, age: Int) = "Hi, my name is "+name +" and age is " +age

  aGreetingFunction("David",23)

  def factorial(n:Long): Long = if(n <= 0) 1 else n * factorial(n - 1)

  println(factorial(20))

  def fibonacci(n:Int):Int =
    if(n<=2)1
    else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(8))

  /*
  prime number
   */

  def prime(n:Int):Boolean = {
   def isPrimeUntil(t:Int):Boolean = {
     if(t <= 1) true
     else n%t != 0 && isPrimeUntil(t-1)

   }
    isPrimeUntil(n / 2)
  }
  println(prime(5))
  println(prime(6))
  println(prime(2))

}
