package homeworks.homework_3;

public class Exersise_2 {

    //Exersise #2

    public static void main(String[] args) {

        int season = 7;
        switch (season) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("What time of year is it now?");
        }

    }

}
