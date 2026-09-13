public class StandardBookingBuilder implements CinemaBookingBuilder {

    private static final String STANDARD_FORMAT = "2D";
    private static final String STANDARD_HALL = "Standard Hall";
    private static final String STANDARD_POPCORN = "Medium Popcorn";
    private static final String STANDARD_DRINK = "Water";

    private String movieTitle;
    private String movieFormat;
    private String hall;
    private int row;
    private int seatNumber;
    private String popcorn;
    private String drink;

    @Override
    public CinemaBookingBuilder setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
        return this;
    }

    @Override
    public CinemaBookingBuilder configureFormat() {
        this.movieFormat = STANDARD_FORMAT;
        return this;
    }

    @Override
    public CinemaBookingBuilder configureHall() {
        this.hall = STANDARD_HALL;
        return this;
    }

    @Override
    public CinemaBookingBuilder setRow(int row) {
        this.row = row;
        return this;
    }

    @Override
    public CinemaBookingBuilder setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    @Override
    public CinemaBookingBuilder configurePopcorn() {
        this.popcorn = STANDARD_POPCORN;
        return this;
    }

    @Override
    public CinemaBookingBuilder configureDrink() {
        this.drink = STANDARD_DRINK;
        return this;
    }

    @Override
    public CinemaBooking build() {
        validateBooking();

        return new CinemaBooking(
                movieTitle,
                movieFormat,
                hall,
                row,
                seatNumber,
                popcorn,
                drink
        );
    }

    private void validateBooking() {
        if (movieTitle == null || movieTitle.isBlank()) {
            throw new IllegalStateException("Movie title must be provided.");
        }

        if (row <= 0) {
            throw new IllegalStateException("Row must be greater than zero.");
        }

        if (seatNumber <= 0) {
            throw new IllegalStateException("Seat number must be greater than zero.");
        }
    }
}