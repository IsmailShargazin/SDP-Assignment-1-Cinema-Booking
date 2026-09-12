public class CinemaBooking {

    private final String movieTitle;
    private final String movieFormat;
    private final String hall;
    private final int row;
    private final int seatNumber;
    private final String popcorn;
    private final String drink;

    public CinemaBooking(
            String movieTitle,
            String movieFormat,
            String hall,
            int row,
            int seatNumber,
            String popcorn,
            String drink
    ) {
        this.movieTitle = movieTitle;
        this.movieFormat = movieFormat;
        this.hall = hall;
        this.row = row;
        this.seatNumber = seatNumber;
        this.popcorn = popcorn;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Movie: " + movieTitle +
                "\nFormat: " + movieFormat +
                "\nHall: " + hall +
                "\nRow: " + row +
                "\nSeat: " + seatNumber +
                "\nPopcorn: " + popcorn +
                "\nDrink: " + drink;
    }
}