package anime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        double[] vect = new double[n];
        int i = 0;
        for (i =0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
           for (i=0;i<n;i++){
               sum += vect[i];
           }
        double avg = sum/n;

           System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
