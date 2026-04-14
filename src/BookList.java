public class BookList implements BookListTAD {

    private int[] book;
    private int capacity;
    private int countBook;
    public BookList (int size){
        this.capacity = size;
        this.book = new int[capacity];
        this.countBook = 0;
    }

    // Metodo de verificação

    @Override
    public boolean bookListFull(){ return countBook== book.length;}

    @Override
    public boolean bookListEmpty(){
        return countBook==0;
    }

    @Override
    public int countBook(){
        return countBook;
    }

    // Metodo de Inserção

    @Override
    public void addBook(int idBook) {
        if (bookListFull()){
            System.out.println("Esta Book list esta com sua capacidade de livros maxima!");
            return;
        }
        book[countBook++]=idBook;
    }

    @Override
    public void insertBook(int index, int idBook) {
        if (bookListFull()){
            System.out.println("Esta Book list esta com sua capacidade de livros maxima!");
            return;
        }
        if (index < 0 || index > countBook){
            System.out.println("Indice invalido!");
            return;
        }
        for (int i = countBook; i > index; i--){
            book[i] = book[i - 1];
        }
        book[index]=idBook;
        countBook++;
    }

    @Override
    public void removeBook(int idBook) {
        if (bookListEmpty()) {
            System.out.println("Esta Book list esta vazia, não e possivel realizar a remoção.");
            return;
        }
        int index = -1;
        for (int i = 0; i < countBook; i++) {
            if (book[i] == idBook) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Id do book: " + idBook + " não foi encontrado nesta Book list");
            return;
        }
        for (int i = index; i < countBook - 1; i++) {
            book[i] = book[i + 1];
        }
        countBook--;
    }

    @Override
    public void findBook(int idBook) {
        int index = -1;
        if (bookListEmpty()) {
            System.out.println("Esta Book list esta vazia, não e possivel encontar o id: "+idBook+".");
            return;
        }
        for (int i = 0; i < countBook; i++) {
            if (idBook == book[i]) {
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println("Id do livro não foi encontrado nesta lista.");
            return;
        }
        System.out.println("Indice encotrado do ID ( "+index+" )");
    }
    @Override
    public void getBook(int indexBook){
        if (bookListEmpty()) {
            System.out.println("Esta Book list esta vazia, não e possivel encontar o id: "+indexBook+".");
            return;
        }
        if (indexBook < 0 || indexBook >= countBook){
            System.out.println("Indice invalido!");
            return;
        }
        System.out.println("ID do livro no índice " + indexBook + ": " + book[indexBook]);
    }

    @Override
    public void setBook(int indexBook, int idBook){
        if (indexBook < 0 || indexBook >= countBook){
            System.out.println("Indice invalido!");
            return;
        }
        book[indexBook]=idBook;
    }

    @Override
    public void display(){
        System.out.print("[");
        for (int i = 0; i < countBook; i++){
            System.out.print(String.format(" %d ", book[i]));
        }
        System.out.println("]");
    }


}

