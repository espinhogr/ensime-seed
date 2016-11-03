import scala.concurrent._
import scala.concurrent.duration._
import scalaz._
import Scalaz._
import scalaz.concurrent.Task


object HelloWorld extends App {

  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.language.postfixOps

  println("HelloWorld!!")

  val a = Future(1)
  val b = Future(2)

  val m = Task(3)

  val m1 = List(2)

  val c = for {
    a1 <- a
    b1 <- b
  } yield a1 + b1

  val d = Await.result(c, 2 seconds)

  Print.print(d)
  println(m.run)
}
