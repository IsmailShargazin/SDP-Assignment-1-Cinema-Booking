public interface CinemaBookingBuilder {

    CinemaBookingBuilder setMovieTitle(String movieTitle);

    CinemaBookingBuilder configureFormat();

    CinemaBookingBuilder configureHall();

    CinemaBookingBuilder setRow(int row);

    CinemaBookingBuilder setSeatNumber(int seatNumber);

    CinemaBookingBuilder configurePopcorn();

    CinemaBookingBuilder configureDrink();

    CinemaBooking build();
}