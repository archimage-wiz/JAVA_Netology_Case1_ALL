public interface Provider {
    void deliverBooks();
}

class ProviderClass extends User implements Reader, Provider {

    ProviderClass(String name) {
        super(name);
    }

    @Override
    public void deliverBooks() {
        System.out.println("Provider " + this.name + " has delivered books in library.");
    }

    @Override
    public void getBook(Administrator contragent) {
        System.out.println("Provider " + this.name + " taken book fom lIbrary.");
        contragent.giveBook(this);
    }

    @Override
    public void returnBook(Administrator contragent) {
        System.out.println("Provider " + this.name + " returned book in library.");
        contragent.acceptBook(this);
    }

}
