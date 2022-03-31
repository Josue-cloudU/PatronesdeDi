public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
        setSwimBehavior(new SwimWithLifeJacket());
    }
    public void display() {
        System.out.println("I'm a Duck Decoy");
    }
}