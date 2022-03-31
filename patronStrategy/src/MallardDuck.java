public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        swimBehavior = new SwimWithMotor();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
