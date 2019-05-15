import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args){
        int[] numbers = new int[20];
        int entry = 0;
        int total = 0;
        int count = 0;
        int average = 0;
        int high = 0;
        int low = 20;
        boolean quit = true;

        Scanner input = new Scanner(System.in);
        while(quit){
            System.out.println("Enter in numbers with in the range of 20");
            entry = input.nextInt();

            if(count == numbers.length-1){
                quit = false;
            }
            numbers[count] = entry;
            count++;
        }
        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
            if(numbers[i]>high){
                high = numbers[i];
            }
            else if(numbers[i]<low){
                low = numbers[i];
            }
        }
        average = total / numbers.length;
        System.out.println("The average number is" + average);
        System.out.println("The highest number is" + high);
        System.out.println("The lowest number is" + low);


    }
}
