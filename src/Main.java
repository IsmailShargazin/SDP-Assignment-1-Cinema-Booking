public class Main {

    public static void main(String[] args) {

        CinemaBookingBuilder standardBuilder =
                new StandardBookingBuilder();

        BookingDirector director =
                new BookingDirector(standardBuilder);

        CinemaBooking standardBooking =
                director.constructBooking(
                        "Spider-Man: Brand New Day",
                        7,
                        12
                );

        System.out.println("=== STANDARD BOOKING ===");
        System.out.println(standardBooking);


        CinemaBookingBuilder vipBuilder =
                new VIPBookingBuilder();

        director.changeBuilder(vipBuilder);

        CinemaBooking vipBooking =
                director.constructBooking(
                        "The Odyssey",
                        2,
                        4
                );

        System.out.println();
        System.out.println("=== VIP BOOKING ===");
        System.out.println(vipBooking);
    }
}