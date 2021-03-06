package mullin.brian.inheritance.superHumans;

/**
 * Created by brianmullin on 5/2/17.
 */


public class SuperMain {

    public static void main (String[] args) {

        Human brian = new Human("Brian", 24, true, "Student", "208 N. Spring Valley Rd.");
//could overide with a toString instead of typing out system.out.println a bunch of times
        System.out.println("Human Profile");
        System.out.println("Name: " + brian.getName());
        System.out.println("Age: " + brian.getAge());
        System.out.println("Gender: " + brian.maleOrFemale());
        System.out.println("Occupation: " + brian.getOccupation());
        System.out.println("Address: " + brian.getAddress());

        SuperHuman theProgrammer = new SuperHuman("Kevin", 28, true, "Employed", "Seaford", true, "The Programmer", "Able to code very better than I can!");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("Super Human Profile");
        System.out.println("Name: " + theProgrammer.getName());
        System.out.println("Age: " + theProgrammer.getAge());
        System.out.println("Gender: " + theProgrammer.maleOrFemale());
        System.out.println("Occupation: " + theProgrammer.getOccupation());
        System.out.println("Address: " + theProgrammer.getAddress());
        System.out.println("Good or Bad: " + theProgrammer.goodOrBad());
        System.out.println("Hero Name: " + theProgrammer.getHeroName());
        System.out.println("Super Ability: " + theProgrammer.getSuperAbility());

    }
}
