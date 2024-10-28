import enums.SeatType;

public class TableSeat {
    private int tableSeatNumber;
    private SeatType type;

    public TableSeat(int seatNumber) {
        this.tableSeatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return tableSeatNumber;
    }

    public boolean updateSeatType(){
        return false;
    }
}
