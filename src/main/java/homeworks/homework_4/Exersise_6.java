package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_6 {

    public static class CalculatorAppSecondImpl {

        public static abstract class Arithmetic {
            public abstract double apply(double x, double y);
        }

        public static class Add extends Arithmetic {
            public double apply(double x, double y) {
                return x + y;
            }
        }

        public static class Subtract extends Arithmetic {
            public double apply(double x, double y) {
                return x - y;
            }
        }

        public static class Multiply extends Arithmetic {
            public double apply(double x, double y) {
                return x * y;
            }
        }

        public static class Divide extends Arithmetic {
            public double apply(double x, double y) {
                return x / y;
            }
        }
    }
}



