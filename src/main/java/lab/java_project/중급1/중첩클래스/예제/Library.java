package lab.java_project.중급1.중첩클래스.예제;

import java.util.ArrayList;
import java.util.List;

public class Library extends PrinterAbstract{

    private List<Book> store = new ArrayList<>();

    @Override
    void showBooks() {
        System.out.println("Book Count : " + store.size());
        for(int i = 0; i < store.size(); i++) {
            System.out.println("[Detail Book #" +(i+1)  + "] > "
                    + " title : " +  store.get(i).title
                    + " author : " + store.get(i).author);
        }
    }

    public void add(String title, String author) {
        store.add(new Book(title, author));
    }

    class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
