package Histogram;
import java.util.Scanner;
import java.io.*;
public class Histogram {

    public static void main(String[] args) throws IOException {

       Scanner scan = new Scanner(new File("C:\\Users\\chulu\\IdeaProjects\\HIstogram\\src\\Histogram\\histogram.txt"));
        int [] numbers = new int[10];
        int entered;

        while (scan.hasNextInt()){
            entered = scan.nextInt();
            //This if statement will solve for the number 50 diving by 10
            //Increment 5th place and decrement the index
            if(entered%10==0){
                entered/=10;
                entered--;
            }
            else{
                entered/=10;
            }
            numbers[entered]++;
        }

        //Print histogram
        for (int i = 0; i < 10; i++){
            int a = numbers[i];
            int b = i*10+1;
            int c = (i+1) *10;
            System.out.print(b + "-" + c +"\t|");
            for (int j = 0; j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}