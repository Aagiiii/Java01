

public class Dog {
    private String dogName;
    private String dogRace;
    private boolean isMale;

    public Dog(String dN, String dR, boolean isMale){
        dogName = dN;
        dogRace = dR;
        this.isMale= isMale;
    }

    public String getName(){
        return dogName;
    }

      public String getRace(){
        return dogRace;
    }

    public boolean getIsMale(){
        return isMale;
    }



}
