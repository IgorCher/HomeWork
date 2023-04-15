import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private String name;
    private String surname;
    private String birthDate;
    private String faculty;
    private int number;
    private String phoneNumber;
    List<Book> books = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        boolean set = true;
        while (set) {
            if (birthDate.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}")) {
                this.birthDate = birthDate;
                set = false;
            } else {
                System.out.println("Не корректная дата, повторите попытку");
                Scanner scan = new Scanner(System.in);
                birthDate = scan.nextLine();
            }
        }
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    void takeBook(Book book) {
        books.add(book);
        System.out.printf("%s %s взял книгу %s\n", name, surname, book.getName());

    }

    void returnBook(String bookName) {
        boolean found = false;
        for (Book book : books) {
            if (bookName.equals(book.getName())) {
                books.remove(book);
                found = true;
                System.out.printf("%s %s вернул книгу %s\n", name, surname, book.getName());
                break;
            }
        }
        if (!found) {
            System.out.printf("%s %s не хранит книгу %s\n", name, surname, bookName);
        }

    }

    void printStatus() {
        int count = 0;
        StringBuilder bookNames = new StringBuilder();
        for (Book book : books) {
            if (book != null) {
                count++;
                bookNames.append(book.getName()).append(", ");
            }
        }
        System.out.printf("%s %s взял %d книг(-у)(-и): %s\n", name, surname, count, bookNames);
    }
}
