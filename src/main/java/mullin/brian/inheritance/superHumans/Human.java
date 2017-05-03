package mullin.brian.inheritance.superHumans;

/**
 * Created by brianmullin on 5/2/17.
 */
public class Human {

    private String name;
    private int age;
    private boolean isMale;
    private String occupation;
    private String address;

    public Human() {

    }
    public Human(String theirName, int theirAge, boolean maleOrFemale, String theirOccupation, String theirAddress) {
//make use of getters and setters, break up the constructors a bit
        //make sure that sub class is actually inheriting methods from classes
        name = theirName;
        age = theirAge;
        isMale = maleOrFemale;
        occupation = theirOccupation;
        address = theirAddress;

    }
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String maleOrFemale() {
        if (isMale == true) {

            return "Male";
        }
        else {

            return "Female";
        }

    }
    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }
}
