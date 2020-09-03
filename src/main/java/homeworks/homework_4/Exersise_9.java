package homeworks.homework_4;

public class Exersise_9 {

    public static void main(String[] args) {

        int[] arr = {5, 3, -1, 8, 0, -6, 1};
        Boolean trigger = false;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (trigger == false) {
                if (arr[i] < 0) {
                    trigger = true;
                }
                continue;
            } else {
                if (arr[i] < 0) {
                    arr[i] = arr[i] * -1;
                }

                sum += arr[i];
            }
        }
        System.out.println(sum);

    }

}
