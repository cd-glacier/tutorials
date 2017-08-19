/**
 * Created by glacier on 2017/07/21.
 */
public class Fib {
   // 回答1
   // 再帰関数
   public static int fib1(int num) {
      if (num == 0) return 0;
      if (num == 1) return 1;
      return fib1(num-1) + fib1(num-2);
   }

   // 回答2
   // 愚直にやる
   public static int fib2(int num) {
      int back1 = 0; //1個前の項
      int back2 = 1; //2個前の項
      int now= 0;    //今の項

      if (num == 0) {
         return back1;
      } else if (num == 1) {
         return back2;
      }

      for (int i = 2; i <= num; i++){
         now = back1 + back2; //今の項は前の項ふたつの足し算
         back1 = back2;       //一つずつずらす
         back2 = now;         //一つずつずらす
      }
      return now;
   }

   public static void main(String[] args){
      System.out.println(fib1(5));
      System.out.println(fib2(5));
   }

}
