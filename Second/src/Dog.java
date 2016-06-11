/**
 * Created by Leha on 05.06.2016.
 */
public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name.equals("Spot")) {
            System.out.println(this.name + " says " + "Ruff!");
        } else {
            System.out.println(this.name + " says " + "Wurf!");
        }
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}
