package Demo4.Software_Design_Principles;

public class RSP {

    Animal animal = new Animal();

    public void animalBio(String eyecolor, String name)
    {
        if(eyecolor.equals("Blue"))
        {
            System.out.println("Animal color is BLUE_");

        }else
        {
            System.out.println("Dont have an eye color");
        }

    }



}
