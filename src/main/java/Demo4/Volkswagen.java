package Demo4;

public class Volkswagen extends Vechile{

    private int windows = 4;
     private String totalWindows = String.valueOf(windows);

    public Volkswagen() {
        super();

    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String move()
    {
        return "A Volkswagen moves on land!";
    }

public String vechName()
{
    return super.vechName() + "Volkswagen Inherited from VECHILE_ Total seats: " + this.totalWindows;

}

}
