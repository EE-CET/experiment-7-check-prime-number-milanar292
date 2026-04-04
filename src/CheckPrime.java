import java.util.Scanner;

class PrimeChecker {
    private int number;

    // Constructor to initialize the number
    public PrimeChecker(int number) {
        this.number = number;
    }

    // Method containing the prime logic
    public boolean isPrime() {
        if (number <= 1) return false;
        
        // Loop from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display the output
    public void displayResult() {
        if (isPrime()) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        int n = sc.nextInt();
        
        // Creating an object and calling methods
        PrimeChecker pc = new PrimeChecker(n);
        pc.displayResult();
        
        sc.close();
    }
}

