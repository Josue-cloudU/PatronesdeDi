public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new SwimWithMotor();
    }

    public void display() {
        System.out.println("I'm a Red Headed Duck");
    }
}
