package mullin.brian.inheritance.superHumans;

/**
 * Created by brianmullin on 5/2/17.
 */
public class SuperHumans extends Human {

    private boolean isGood;
    private String heroName;
    private String superAbility;

    public SuperHumans() {

    }

    public SuperHumans(boolean goodOrBad, String theirHeroName, String theirSuperAbility) {

        isGood = goodOrBad;
        heroName = theirHeroName;
        superAbility = theirSuperAbility;

    }
    public boolean isGood() {

        return isGood;
    }
    public String getHeroName(){

        return heroName;
    }
    public String getSuperAbility(){

        return superAbility;
    }
}

