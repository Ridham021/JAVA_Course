public class Main {

    public static void main(String[] args) {

        //Movie Starts
//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();
/*

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
*/

        //Movie Ends

        /*Cars cars = new Cars("2022 Blue Ferari 296 GTS");
        runRace(cars);

        Cars ferari = new GasPoweredCars("2022 Blue Ferari 296 GTS",15.4,8);
        runRace(ferari);*/

        //End of Cars

        //Car assingment starts

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

    public static void runRace(Cars cars) {

        cars.startEngine();
        cars.drive();
    }
}
