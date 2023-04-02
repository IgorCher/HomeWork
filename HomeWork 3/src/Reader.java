public class Reader {
    private String name;
    private String surname;
    private String birthDate;
    private String faculty;
    private int number;
    private String phoneNumber;
    Book [] books = new Book[10];

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber () {
        return number;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    void takeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books[i] = book;
                System.out.println(name + " " + surname + " взял книгу " + book.getName());
                break;
            }
        }
    }
    void returnBook (String bookName){
        boolean found = false;
        for (int i  = 0; i < books.length; i++){
            if (books[i] != null && books[i].getName().equals(bookName)){
                books[i] = null;
                System.out.println(name + " " + surname + " вернул книгу " + bookName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " " + surname + " не хранит книгу " + bookName);
        }
    }
    void printStatus (){
        int count = 0;
        StringBuilder bookNames = new StringBuilder();
        for (Book book : books) {
            if (book != null) {
                count++;
                bookNames.append(book.getName()).append(", ");
            }
        }
        System.out.println(name + " " + surname + " взял " + count + " книг(-у)(-и): " + bookNames);
    }
}
