import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Grade_calculator {
static int numSubjects;
static int sum;
static double average;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> gradeMap = new HashMap<String, Integer>();
        System.out.println("Enter number of subjects: ");
        numSubjects = scanner.nextInt();
        scanner.nextLine();
        
        while (true) {
            if (numSubjects == 0) {
                System.out.println("You have entered 0 subjects. Please enter a valid number of subjects: ");
                numSubjects = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Please enter your subject and grades");
                for (int i = 0; i < numSubjects; i++) {
                    System.out.println("Enter subject " + (i+1) + ":");
                    String subject = scanner.nextLine(); 
                    System.out.println("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    gradeMap.put(subject, grade);
                } 
                System.out.println("**********************************"); 
                break; 
            }
       
        }
         System.out.println("Here is a summary of your grades:");
            for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        System.out.println("**********************************");
         System.out.println("Total marks: " + total_marks(gradeMap));
         System.out.println("Average: " + calc_avg());
         System.out.println("Overall grade: " + grader());
         System.out.println("**********************************");
            }
                        
    
    public static int total_marks(Map<String,Integer> x){
    sum = 0;
    for (Integer value: x.values()){
         sum += value;
         }   
         return sum;  
    }
    
    public static double calc_avg() {
        average = sum / numSubjects;
        return Math.round(average * 100.0) / 100.0;
     }
    
    public static char grader(){
     if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    } 
    

    
   
}


