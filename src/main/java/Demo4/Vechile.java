package Demo4;

public abstract class Vechile {

    private String name = "Vechile: ";


    public Vechile() {
    }


    public String vechName() {
        return name;
    }

    public abstract String move();

    public String toString()
    {
        return "This is a Abstract Class " + this.name;

    }

}