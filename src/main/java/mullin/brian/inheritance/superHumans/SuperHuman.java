package mullin.brian.inheritance.superHumans;

/**
 * Created by brianmullin on 5/2/17.
 */
public class SuperHuman extends Human {

    private boolean isGood;
    private String heroName;
    private String superAbility;

    public SuperHuman() {

    }

    public SuperHuman(String theirName, int theirAge, boolean maleOrFemale, String theirOccupation,
                      String theirAddress,boolean goodOrBad, String theirHeroName, String theirSuperAbility) {

        super(theirName, theirAge, maleOrFemale, theirOccupation, theirAddress);
        isGood = goodOrBad;
        heroName = theirHeroName;
        superAbility = theirSuperAbility;

    }
    public String goodOrBad() {
        if (isGood == true) {

            return "Good";
        }
        else {

            return "Bad";
        }

    }
    public String getHeroName(){

        return heroName;
    }
    public String getSuperAbility(){

        return superAbility;
    }
}

