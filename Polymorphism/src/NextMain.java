public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","jaws");
        movie.watchMovie();

        Adventure adventure = (Adventure) Movie.getMovie("A","Jaws");
        adventure.watchMovie();
    }
}
