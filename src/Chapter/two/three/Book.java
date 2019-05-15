package Chapter.two.three;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String b_BookName;
    private String b_Author;
    private String b_Press;
    private long PubDate;

    public Book(String bookName, String author, String press, String pubDate) {
        this.b_BookName = new String(bookName);
        this.b_Author = new String(author);
        this.b_Press = new String(press);
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.PubDate = dfs.parse(pubDate).getTime();
        } catch (ParseException e) {
            this.PubDate = 0;
        }
    }

    public String getBookName() {
        return this.b_BookName;
    }

    public String getAuthor() {
        return this.b_Author;
    }

    public String getPress() {
        return this.b_Press;
    }

    public Date getDate() {
        return new Date(this.PubDate);
    }

    public String toString() {
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-mm-dd");
        Date pubDate = new Date(this.PubDate);
        return new String("Book Name: " + this.b_BookName + "\nAuthor: " + this.b_Author + "\nPress: " + this.b_Press
                + "\nPublishing Date: " + dfs.format(pubDate));
    }
}