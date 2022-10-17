

public class Author {

    String name;
    String country;
    Book [] books;

    public Author(String name, String country) {
        this.name = name;
        this.country = country;                
    }

    public void addBook(Book bk){
        if(this.books == null){
            this.books = new Book[0];
        }
        Book [] tmp = new Book[this.books.length+1];
        for (int cur_bk = 0; cur_bk < tmp.length-1; ++cur_bk){
            tmp[cur_bk] = this.books[cur_bk];
        }
        tmp[tmp.length-1] = bk;
        this.books = tmp;
    }
    
}
