public class Main {
    public static void main(String[] args) {
        System.out.println("=== CNU PROJECT ===");
        System.out.println("HTML, CSS, and Java Demo");
        
        // Simple calculation
        int num1 = 15;
        int num2 = 25;
        int total = addNumbers(num1, num2);
        
        System.out.println(num1 + " + " + num2 + " = " + total);
        System.out.println("Project created successfully!");
    }
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
