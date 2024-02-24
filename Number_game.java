import java.util.Scanner;

public class Number_game {
static int max = 100;
static int min = 1;
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int rnd_num= rnd_generator(max, min);
   System.out.print("First adjust range");
   System.out.print("How many tries would you like?");
   int number_of_tries = scanner.nextInt();
   System.out.print("***********************");
   System.out.println("Enter a number between " + max + " and " + min + ":");
   int user_num = scanner.nextInt();
   if(user_num > rnd_num){
   System.out.print("too high");
   }
   if(user_num < rnd_num){
   System.out.print("too low");
   }
   
   System.out.print("too low");
   System.out.print("correct");
   
   
   scanner.close();
  
 
 }

   public static int rnd_generator(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
   }


}