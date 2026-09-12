public class BookingDirector {

    private CinemaBookingBuilder builder;

    public BookingDirector(CinemaBookingBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(CinemaBookingBuilder builder) {
        this.builder = builder;
    }

    public CinemaBooking constructBooking(
            String movieTitle,
            int row,
            int seatNumber
    ) {
        return builder
                .setMovieTitle(movieTitle)
                .configureFormat()
                .configureHall()
                .setRow(row)
                .setSeatNumber(seatNumber)
                .configurePopcorn()
                .configureDrink()
                .build();
    }
}