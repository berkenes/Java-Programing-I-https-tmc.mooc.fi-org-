
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = 0;

        int price = this.squares * this.princePerSquare;

        int comparedPrice = compared.squares * compared.princePerSquare;

        difference = price - comparedPrice;
        if (difference < 0) {
            return difference * (-1);
        }
        return difference;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int difference = 0;
        int price = 0;
        price = this.squares * this.princePerSquare;
        int comparePrice = compared.squares * compared.princePerSquare;

        difference = price - comparePrice;
        if (difference > 0) {
            return true;
        }
        return false;
    }
}
