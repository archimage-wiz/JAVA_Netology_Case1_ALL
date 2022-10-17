public interface Reader {
        void getBook(Administrator contragent);
        void returnBook(Administrator contragent);
}

class ReaderClass extends User implements Reader {
    
    ReaderClass(String name){
        super(name);
    }

    @Override
    public void getBook(Administrator contragent) {
        System.out.println("Reader " + this.name + " taken book fom library.");
        contragent.giveBook(this);
    }

    @Override
    public void returnBook(Administrator contragent) {
        System.out.println("Reader " + this.name + " returned book in library.");
        contragent.acceptBook(this);
    }

}

