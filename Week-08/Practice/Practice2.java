
import java.time.LocalDate;
import java.util.Scanner;

public class Practice2 {
    static abstract class LibraryItem {
        String title;

        LibraryItem(String title) {
            this.title = title;
        }

        abstract int getLoanDays();
    }

    static class Book extends LibraryItem {
        Book(String title) {
            super(title);
        }

        int getLoanDays() {
            return 14;
        }
    }

    static class DVD extends LibraryItem {
        DVD(String title) {
            super(title);
        }

        int getLoanDays() {
            return 7;
        }
    }

    static class Magazine extends LibraryItem {
        Magazine(String title) {
            super(title);
        }

        int getLoanDays() {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.nextLine().trim();

            if (title.startsWith("\"") && title.endsWith("\"")) {
                title = title.substring(1, title.length() - 1);
            }

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }

            LocalDate dueDate =
                    currentDate.plusDays(item.getLoanDays());

            System.out.println(item.title + ": " + dueDate);
        }

        sc.close();
    }
}
