
class Book {
    String name;
    Author author;
    String publisher;
    int pages_total;
    int publish_year;
    int last_read_page;

    public Book(String name, Author author, int pages_total, int publish_year, String publisher){
        this.name = name;
        this.author = author;
        this.pages_total = pages_total;
        this.publish_year = publish_year;
        this.publisher = publisher;
        this.last_read_page = 1;
    }
    public Book(String name, Author author, int pages_total, int publish_year){
        this(name, author, pages_total, publish_year, "Unknown");
    }
    
    @Override
    public String toString() {
        return "Book: " + this.name + ", by " + this.author.name + " @ " + this.publish_year;
    }

    public boolean isEqual(Book subj){
        if (this.pages_total == subj.pages_total){
            return true;
        }
        return false;
    }

    public void setLastReadPage(int page){
        this.last_read_page = page;
    }
    public int getLastReadPage(){
        return this.last_read_page;
    }

}
