import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade da Booklist: ");
        int capacity = scanner.nextInt();
        BookList bookList = new BookList(capacity);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("                        MENU BOOKLIST                         ");
            System.out.println("--------------------------------------------------------------\n");
            System.out.println("1. Adicionar livro na Booklist (addBook)");
            System.out.println("2. Inserir livro na Booklist (insertBook)");
            System.out.println("3. Remover livro na Booklist(removeBook)");
            System.out.println("4. Encotrar livro por id  (findBook)");
            System.out.println("5. Encotrar livro por indice (getBook)");
            System.out.println("6. Setar uma livro a um indice (setBook)");
            System.out.println("7. Exibir informações sobre a Booklist (Size/Full/Empty)");
            System.out.println("8. Exibir todos os livros (display)");
            System.out.println("0.  Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira o id do novo livro: ");
                    bookList.addBook(scanner.nextInt());
                }
                case 2 -> {
                    System.out.println("Insira o id do novo livro: ");
                    int idbook = scanner.nextInt();
                    System.out.println("Insira o indice do novo livro da Booklist: ");
                    bookList.insertBook(scanner.nextInt(), idbook);
                }
                case 3 -> {
                    System.out.println("Insira o id do livro para a remoção: ");
                    bookList.removeBook(scanner.nextInt());
                }
                case 4 -> {
                    System.out.println("Insira o id do livro que deseja encontrar na Booklist: ");
                    bookList.findBook(scanner.nextInt());
                }
                case 5 -> {
                    System.out.println("Insira o indice da Booklist que deseja encontrar:");
                    bookList.getBook(scanner.nextInt());
                }
                case 6 -> {
                    System.out.println("Insira o id do novo livro que deseja setar:");
                    int idBook = scanner.nextInt();
                    System.out.println("Insira o indice da novo livro no Booklist:");
                    bookList.setBook(scanner.nextInt(), idBook);
                }
                case 7 -> {
                    System.out.println("Tamanho da Booklist (countBook): " + bookList.countBook());
                    System.out.println("Booklist esta cheia (bookListFull): " + bookList.bookListFull());
                    System.out.println("Booklist esta vazia (bookListEmpty): " + bookList.bookListEmpty());
                }
                case 8 -> {
                    System.out.println("Id dos livro no Booklist: ");
                    bookList.display();
                }
                case 0 -> System.out.println("Encerrando programa...");

                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
