public class MiniDuckSimulator {
    public static void main(String[] args){
        MallardDuck	mallard = new MallardDuck();
//        FlyBehavior cantFly = () -> System.out.println("I can't fly");
//        QuackBehavior squeak = () -> System.out.println("Squeak");
//        SwimBehavior engine = () -> System.out.println("I'm swimming with a Engine!");
//        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak, engine);
        RubberDuck rubberDuckie = new RubberDuck();
        RedheadDuck redhead = new RedheadDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        redhead.performSwim();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performSwim();
        model.setSwimBehavior(new Swim());
        model.performSwim();
    }
}
