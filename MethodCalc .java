class calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}

public class MethodCalc {

    public static void main(String[] args) {

        calculator c = new calculator();

        // Call the add method for two integers
        int intSum = c.add(5, 10);
        System.out.println("Sum of two integers: " + intSum);

        // Call the add method for three doubles
        double doubleSum = c.add(3.5, 4.5, 5.5);
        System.out.println("Sum of three doubles: " + doubleSum);

        // Call the add method for two floats
        float floatSum = c.add(2.5f, 3.5f);
        System.out.println("Sum of two floats: " + floatSum);

        // Call the add method for an integer and a double
        double mixedSum = c.add(4, 7.5);
        System.out.println("Sum of an integer and a double: " + mixedSum);
    }
}
