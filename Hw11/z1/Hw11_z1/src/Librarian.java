public interface Librarian {
    void orderBook(Provider contragent);
}

class LibrarianClass extends User implements Librarian {

    LibrarianClass(String name) {
        super(name);
    }

    @Override
    public void orderBook(Provider contragent) {
        System.out.println("Librarian " + this.name + " ordered books from " + ((User) contragent).name + " for library.");
        contragent.deliverBooks();
    }

}
