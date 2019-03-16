package Demo4;

public class Vechile {

    private String name;
    private int  windows;
    private int seats;



    public Vechile(String name, int windows, int seats) {
        this.name = name;
        this.windows = windows;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Vechile{" +
                "name='" + name + '\'' +
                ", windows=" + windows +
                ", seats=" + seats +
                '}';
    }
}
