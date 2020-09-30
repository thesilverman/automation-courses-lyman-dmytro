package homeworks.homework_8;

public class Exersise1LibraryApp {

    public static void main(String[] args) {


        Exersise1Author author1 = new Exersise1Author("Sergey", "Lukyanenko");
        Exersise1Author author2 = new Exersise1Author("Lora", "Demianenko");
        Exersise1Author author3 = new Exersise1Author("Sara", "Barbara");
        Exersise1Author author4 = new Exersise1Author("Lera", "Lera");
        Exersise1Author author5 = new Exersise1Author("Katay", "Katay");
        Exersise1Author author6 = new Exersise1Author("Sasha", "Sasha");
        Exersise1Author author7 = new Exersise1Author("Masha", "Masha");
        Exersise1Author author8 = new Exersise1Author("Dima", "Dima");


        Exersise1Book book1 = new Exersise1Book("1", "Night Dozor", author1, "1998", "", "");
        Exersise1Book book2 = new Exersise1Book("2", "Night Dozor2", author2, "2001", "", "");
        Exersise1Book book3 = new Exersise1Book("3", "Volkodav", author3, "2005", "", "");
        Exersise1Book book4 = new Exersise1Book("4", "Garry Potter", author4, "2006", "", "");
        Exersise1Book book5 = new Exersise1Book("5", "Eragon", author5, "2007", "", "");
        Exersise1Book book6 = new Exersise1Book("6", "Eragon2", author6, "2011", "", "");
        Exersise1Book book7 = new Exersise1Book("7", "Eragon3", author7, "2012", "", "");
        Exersise1Book book8 = new Exersise1Book("8", "Ragnareck", author8, "2013", "", "");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println(book5.toString());
        System.out.println(book6.toString());
        System.out.println(book7.toString());
        System.out.println(book8.toString());
        System.out.println(author1.toString());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());

    }

}
