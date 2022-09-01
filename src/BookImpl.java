import java.util.ArrayList;
import java.util.List;

public class BookImpl {
    public static void main(String[] args) {

        Book object = new Book();
        Book b1 = new Book("Abcd ","RN TAGORE",12345678L,1125.58);
        Book b2 = new Book("kmln","ahdhj",25465845L,456.25);
        Book b3 = new Book("jhnm","aaa",546952L,853.95);
        Book b4 = new Book("hgnd","ddd",452165L,785.69);
        Book b5 = new Book("kajnnm","juhm",589652L,452.65);

        List<Book> bookList = new ArrayList<>();

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        
        for (Book element : bookList){
            System.out.println("element = " + element);
        }

        for (int i = 0; i < bookList.size() ; i++){
            for (int j = 0; j < bookList.size() - 1 -i ; j++) {
                if (bookList.get(j).getPrice() > bookList.get(j+1).getPrice()){
                    Book temp = bookList.get(j);
                    bookList.set(j,bookList.get(j+1));
                    bookList.set(j+1,temp);

                }

            }

            
        }
        System.out.println("bookList = " + bookList);




    }
}
