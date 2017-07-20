import scala.concurrent.duration.Duration
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.{Failure, Success}

object FirstOf {
  def firstOf[A](v1: Future[A], v2: Future[A]): Future[A] = {
    val p = Promise[A]()
    v1 onSuccess {
      case v => p.tryComplete(v)
    }
    v2 onSuccess {
      case v => p.tryComplete(v)
    }
    p.fututre
  }

  def main(args: Array[String]): Unit = {
    val r1 = firstOf(Future{ Thread.sleep(9000); 1 }, Future{ Thread.sleep(3000); 2 })
    println(Await.result(r1, Duration.Inf)) // 3s後に2と表示

    val r2 = firstOf(Future{ Thread.sleep(900); 1 }, Future.failed(new Exception))
    r2.value.get.isFailure // こちらは失敗が確定しているFutureを渡すので即trueが返る
    println(r2.value.get.isFailure)
  }
}


