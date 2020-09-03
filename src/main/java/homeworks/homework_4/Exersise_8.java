package homeworks.homework_4;

class Exersise_8 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resArr = new int[arr.length];

        int start = 2;
        int stop = 4;
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i<start || i> stop) {
                resArr[lastIndex] = arr[i];
                lastIndex++;
            }
        }

    }

}


