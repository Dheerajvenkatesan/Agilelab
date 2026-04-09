public class App {
    public String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        System.out.println("7 is " + new App().checkEvenOdd(7));
    }
}
