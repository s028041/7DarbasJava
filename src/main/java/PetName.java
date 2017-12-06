public class PetName {
    private String name;

    public boolean isHappy() {
        return happy;
    }

    public boolean happy = false;


    public PetName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playWithPeople() {
        happy = true;
    }
}
