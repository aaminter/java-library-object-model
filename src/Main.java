public class Main {
    public static void main(String[] args) {
        System.out.println("Home work 15");
        Author firstAuthor = new Author("Лев", "Толстой");
        Book firstBook = new Book(firstAuthor, "Война и мир", 1867);
        Book secondBook = new Book("Михаил", "Лермонтов", "Кавказский пленник", 1891);
        System.out.println('\n' + firstBook.getAuthorFullName() + '\n' + firstBook.getName() + '\n'
                + firstBook.getManufactureYear() + " года выпуска");
        secondBook.printBook();
        secondBook.setManufactureYear(1890);
        secondBook.printBook();
    }

}