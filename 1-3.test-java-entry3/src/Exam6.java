public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(5, 5, '*'));

    }

    static int calc(int num1, int num2, char kigo) {

        if (kigo == '+') {
            return num1 + num2;

        } else if (kigo == '-') {
            return num1 - num2;

        } else if (kigo == '*') {
            return num1 * num2;

        } else if (kigo == '/') {
            return num1 / num2;

        } else {
            return -1;
        }
    }
}
