public interface BookListTAD {
    void addBook(int idBook);
    void insertBook(int indexBook, int idBook);
    void removeBook(int idBook);
    void findBook(int idBook);
    void getBook(int indexBook);
    void setBook(int indexBook, int idBook);
    boolean bookListFull();
    boolean bookListEmpty();
    int countBook();
    void display();
}
