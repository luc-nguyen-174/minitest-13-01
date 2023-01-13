import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[10];
        books[0] = new FictionBook("1", "Ubik", 150.99, "Philip K. Dick", "Viễn tưởng");
        books[1] = new FictionBook("2", "Dune", 180.99, "Frank Herbert", "Viễn tưởng");
        books[2] = new ProgrammingBook("3", "The Pragmatic Programmer", 89.99, "Andrew Hunt", "None", "None");
        books[3] = new FictionBook("4", "Labyrinths", 97.99, "Jorge Luis Borges", "Văn học");
        books[4] = new ProgrammingBook("5", "The Clean Coder: A Code of Conduct for Professional Programmers ", 66.99, "Robert C.Martin", "None", "Clean Code");
        books[5] = new ProgrammingBook("6", "Lập Trình Và Cuộc Sống", 187.99, "Jeff Atwood", "None", "None");
        books[6] = new FictionBook("7", "1984", 30.99, "George Orwell", "Viễn tưởng");
        books[7] = new FictionBook("8", "Neuromancer", 60.99, "William Gibson", "Viễn tưởng");
        books[8] = new ProgrammingBook("9", "Giáo Trình Kỹ Thuật Lập Trình C Căn Bản Và Nâng Cao", 18.99, "Phạm Văn Ất", "C", "C");
        books[9] = new ProgrammingBook("10", "Lập trình hướng đối tượng JAVA core dành cho người mới bắt đầu học lập trình", 249.99, "Neo. Thành", "Java", "Javacore");

        System.out.println("Nhập vào language cần tìm (ex:Java)");
        String language = scanner.nextLine();

        System.out.println("Nhập vào category cần tìm (ex: Viễn tưởng");
        String category = scanner.nextLine();

        System.out.println("Nhập vào giá");
        int price = scanner.nextInt();

        Main main = new Main();
        System.out.println("Tổng tiền " + books.length + " cuốn sách là: " + main.getAmount(books) + "đ.");
        System.out.println("Số sách Programming có language là " + language + " là " + main.javaBookCount(books, language));
        System.out.println("Số sách Fiction có category là " + category + "là: " + main.fictionsCount(books, category));
        System.out.println("Số sách Fiction có giá bé hơn " + price + " là: " + main.fictionsCount2(books, price));

    }


    public double getAmount(Book[] books) {
        double amount = 0;
        for (Book book : books) {
            amount += book.getPrice();
        }
        return amount;
    }

    public int javaBookCount(Book[] books, String str) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage().equals(str)) {
                count++;
            }
        }
        return count;
    }

    public int fictionsCount(Book[] books, String str) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory().equals(str))
                count++;
        }
        return count;
    }

    public int fictionsCount2(Book[] books, int price) {
        int count = 1;
        for (Book book : books) {
            if (book instanceof FictionBook && ((FictionBook) book).getPrice() < price) {
                count++;
            }
        }
        return count;
    }

}