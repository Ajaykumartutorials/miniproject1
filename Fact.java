public class Fact{
    public static void main(String[] args) {
        int n = 20; // Number of alternate prime numbers to display
        int count = 0;
        int num = 2; // Starting from the first prime number

        System.out.println("Alternate Prime Numbers:");

        while (count < n) {
            if (isPrime(num)) {
                if (count % 2 == 0) {
                    System.out.print(num + " ");
                }
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
