package mn.icode;



class Bird {
    String race;

    public Bird(String race){
        this.race = race;
    }
}

class Dove extends Bird implements Swimmable, Flyable{
    public Dove(String race){
        super(race);
    }
    @Override
    public boolean canFly() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean canSwim() {
        // TODO Auto-generated method stub
        return false;
    }
}

class RubberBird extends Bird implements Swimmable, Flyable{
    public RubberBird(String race){
        super(race);
    }

    @Override
    public boolean canFly() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canSwim() {
        // TODO Auto-generated method stub
        return true;
    }
}