import java.util.Scanner;

public class gradeAvg {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades would you like to enter up to a maximum of 20?");
        int choice = scan.nextInt();
        
        if(choice > 20){
            System.out.println("Input is too large.");
        }
        else{
        
        int[] Array = new int[choice];
        for(int i = 0; i < Array.length; i++){
            System.out.println("Enter grade " + (i+1) + ": ");
            Array[i] = scan.nextInt();
        }
        getGrades(Array);
        calcAvg(Array);
        calcMin(Array);
        calcMax(Array);
        }
    }
    public static void getGrades(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.println("Grade " + (i+1) +": " + Array[i]);
                    }
    }
    public static void calcAvg(int[] Array){
        int sum = 0;
        for(int i = 0; i < Array.length; i++){
            sum += Array[i];
        }
        double average = sum / Array.length;
        System.out.println("Average Grade: " + average);
        
        
    }
    public static void calcMin(int[] Array){
        int smallest = Array[0];
        for(int i = 0; i < Array.length; i++){
            if(Array[i] < smallest){
                smallest = Array[i];
            }
        }
        System.out.println("Lowest Grade: " + smallest);
    }
    public static void calcMax(int[] Array){
        int largest = Array[0];
        for(int i = 0; i < Array.length; i++){
            if(Array[i] > largest){
                largest = Array[i];
            }
        }
        System.out.println("Highest Grade: " + largest);
    }
    
}
