import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        List<Reader> readers = new ArrayList<>();

        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println("Ввелите номер действия");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    Reader reader = new Reader();
                    System.out.println("Введите имя");
                    reader.setName(scanner.nextLine());
                    System.out.println("Введите фамилию");
                    reader.setSurname(scanner.nextLine());
                    System.out.println("Введите номер читательского билета");
                    reader.setNumber(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Введите дату рождения (ДД.ММ.ГГГГ)");
                    reader.setBirthDate(scanner.nextLine());
                    System.out.println("Введите факультет");
                    reader.setFaculty(scanner.nextLine());
                    System.out.println("Введите номер телефона");
                    reader.setPhoneNumber(scanner.nextLine());
                    readers.add(reader);
                    break;
                }
                case 2: {
                    Book book = new Book();
                    System.out.println("Введите название книги");
                    book.setName(scanner.nextLine());
                    System.out.println("Введите автора");
                    book.setAuthorName(scanner.nextLine());
                    System.out.println("О чем книга?");
                    book.setText(scanner.nextLine());
                    System.out.println("Введите номер читательского билета");
                    int number = scanner.nextInt();
                    for (Reader reader : readers) {
                        if (reader.getNumber() == number) {
                            reader.takeBook(book);
                        } else {
                            System.out.println("Такого пользователя нет");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите название книги");
                    String bookName = scanner.nextLine();
                    System.out.println("Введите номер читательского билета");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Reader reader : readers) {
                        if (reader.getNumber() == number) {
                            reader.returnBook(bookName);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Reader reader : readers) {
                        if (reader.getNumber() == number) {
                            reader.printStatus();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader reader : readers) {
                        if (reader != null) {
                            reader.printStatus();
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }
}