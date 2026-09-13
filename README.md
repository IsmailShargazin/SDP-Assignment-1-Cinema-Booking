# Cinema Booking Builder Pattern

This project is an implementation of the Builder design pattern in Java.

The program creates different types of cinema bookings step by step.
It demonstrates how the same construction process can produce different booking configurations.

## Booking Types

The project supports two booking types:

### Standard Booking
- 2D format
- Standard Hall
- Medium Popcorn
- Water

### VIP Booking
- IMAX format
- VIP Hall
- Large Popcorn
- Coca-Cola

The movie title, row, and seat number can be selected separately for each booking.

## Builder Pattern Structure

The project contains the main components of the Builder pattern:

- `CinemaBooking` — Product
- `CinemaBookingBuilder` — Builder interface
- `StandardBookingBuilder` — Concrete Builder
- `VIPBookingBuilder` — Concrete Builder
- `BookingDirector` — Director
- `Main` — Client

## Technologies

- Java
- JDK 17
- IntelliJ IDEA

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is selected.
3. Open `Main.java`.
4. Run the `main()` method.
5. The Standard and VIP bookings will be displayed in the console.

## Example Output

```text
=== STANDARD BOOKING ===
Movie: Spider-Man: Brand New Day
Format: 2D
Hall: Standard Hall
Row: 7
Seat: 12
Popcorn: Medium Popcorn
Drink: Water

=== VIP BOOKING ===
Movie: The Odyssey
Format: IMAX
Hall: VIP Hall
Row: 2
Seat: 4
Popcorn: Large Popcorn
Drink: Coca-Cola