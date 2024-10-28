import enums.TableStatus;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;
    private int locationIdentifier;
    private int capacity;
    private List<TableSeat> seats;

    public Table(int tableID, int capacity) {
        this.tableID = tableID;
        this.capacity = capacity;
        this.seats = new ArrayList<>();
    }

    public void addSeat(TableSeat seat) {
        seats.add(seat);
    }

    public int getTableIDId() {
        return tableID;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<TableSeat> getSeats() {
        return seats;
    }

}
