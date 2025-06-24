public class Book {
    int price;
    public Book(int price){
        this.price = price;
    }
    public static void bug(int price){
        int bugg =1000;
        if (price <bugg ){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book(900);
   bug(b1.price);
    }
}
