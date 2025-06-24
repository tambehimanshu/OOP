public class Movie {
    String name;
    int rating;

    public Movie(String name, int rating){
        this.name = name;
        this.rating = rating;

    }

    public static void checkRating(int rating){
        if(rating >= 4){
            System.out.println("movie hit");
        }
        else{
            System.out.println("not hit");
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("kgf", 5);
        checkRating(m1.rating);
    }
    
}
