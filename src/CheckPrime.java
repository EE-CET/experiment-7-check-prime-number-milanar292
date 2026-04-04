import java.util.Scanner;

// Dedicated class for Prime logic (OOP approach)
class PrimeChecker {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

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

    public void displayResult() {
        if (isPrime()) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

// Main class to run the program
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is an integer to avoid errors
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // Create object and call method
            PrimeChecker pc = new PrimeChecker(n);
            pc.displayResult();
        }
        
        sc.close();
    }
}

