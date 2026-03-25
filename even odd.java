public class EvenOdd {
    public static void main(String[] args) {
        // Use the full path java.util.Scanner instead of an import
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt(); 
        scanner.close();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        
        System.out.println("SUCCESS");
    }
}
