public interface Administrator {
    void giveBook(Reader contragent);
    void acceptBook(Reader contragent);
    void overdueNotification(Reader contragent);
}

class AdministratorClass extends User implements Reader, Administrator {

    AdministratorClass(String name) {
        super(name);
    }

    @Override
    public void giveBook(Reader contragent) {
        System.out.println(this.name + " given book to " + ((User) contragent).name);
    }
    
    @Override
    public void acceptBook(Reader contragent) {
        System.out.println(this.name + " accepted book from " + ((User) contragent).name);
    }

    @Override
    public void overdueNotification(Reader contragent) {
        System.out.println(((User) contragent).name + " has overdued a book..");
    }

    @Override
    public void getBook(Administrator contragent) {
        System.out.println("Administrator " + this.name + " taken book fom library.");
        contragent.giveBook(this);
    }

    @Override
    public void returnBook(Administrator contragent) {
        System.out.println("Administrator " + this.name + " returned book in library.");
        contragent.acceptBook(this);
    }


    
}
