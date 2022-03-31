import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MallardDuck	mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        RedheadDuck redhead = new RedheadDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck model = new ModelDuck();

        int band = 0;

        while (band == 0){
            System.console();
            System.out.println("Menu: ");
            System.out.println("1- Mallard duck");
            System.out.println("2- Rubber duck");
            System.out.println("3- Readhead duck");
            System.out.println("4- Decoy duck");
            System.out.println("5- Model duck");
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una opcion: ");
            int opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("1- volar");
                    System.out.println("2- nadar");
                    System.out.println("3- graznar");
                    System.out.println("4- cambiar comportamiento");
                    System.out.println("Ingrese una opcion: ");
                    opc = leer.nextInt();
                    switch (opc){
                        case 1:
                            mallard.performFly();
                            break;
                        case 2:
                            mallard.performSwim();
                            break;
                        case 3:
                            mallard.performQuack();
                            break;
                        case 4:
                            System.out.println("1- cambiar volar");
                            System.out.println("2- cambiar nadar");
                            System.out.println("3- cambiar graznar");
                            System.out.println("Ingrese una opcion: ");
                            opc = leer.nextInt();
                            switch (opc){
                                case 1:
                                    System.out.println("1- FlyWithWings");
                                    System.out.println("2- FlyRocketPowered");
                                    System.out.println("3- FlyNoWay");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc){
                                        case 1:
                                            mallard.setFlyBehavior(new FlyWithWings());
                                            mallard. performFly();
                                            break;
                                        case 2:
                                            mallard.setFlyBehavior(new FlyRocketPowered());
                                            mallard. performFly();
                                            break;
                                        case 3:
                                            mallard.setFlyBehavior(new FlyNoWay());
                                            mallard. performFly();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 2:
                                    System.out.println("1- Swim");
                                    System.out.println("2- SwimWithLifeJacket");
                                    System.out.println("3- SwimWithMotor");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            mallard.setSwimBehavior(new Swim());
                                            mallard.performSwim();
                                            break;
                                        case 2:
                                            mallard.setSwimBehavior(new SwimWithLifeJacket());
                                            mallard.performSwim();
                                            break;
                                        case 3:
                                            mallard.setSwimBehavior(new SwimWithMotor());
                                            mallard.performSwim();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 3:
                                    System.out.println("1- Quack");
                                    System.out.println("2- MuteQuack");
                                    System.out.println("3- Squeak");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            mallard.setQuackBehavior(new Quack());
                                            mallard.performQuack();
                                            break;
                                        case 2:
                                            mallard.setQuackBehavior(new MuteQuack());
                                            mallard.performQuack();
                                            break;
                                        case 3:
                                            mallard.setQuackBehavior(new Squeak());
                                            mallard.performQuack();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + opc);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opc);
                    }
                    break;

                case 2:
                    System.out.println("1- volar");
                    System.out.println("2- nadar");
                    System.out.println("3- graznar");
                    System.out.println("4- cambiar comportamiento");
                    System.out.println("Ingrese una opcion: ");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            rubberDuckie.performFly();
                            break;
                        case 2:
                            rubberDuckie.performSwim();
                            break;
                        case 3:
                            rubberDuckie.performQuack();
                            break;
                        case 4:
                            System.out.println("1- cambiar volar");
                            System.out.println("2- cambiar nadar");
                            System.out.println("3- cambiar graznar");
                            System.out.println("Ingrese una opcion: ");
                            opc = leer.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("1- FlyWithWings");
                                    System.out.println("2- FlyRocketPowered");
                                    System.out.println("3- FlyNoWay");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            rubberDuckie.setFlyBehavior(new FlyWithWings());
                                            rubberDuckie.performFly();
                                            break;
                                        case 2:
                                            rubberDuckie.setFlyBehavior(new FlyRocketPowered());
                                            rubberDuckie.performFly();
                                            break;
                                        case 3:
                                            rubberDuckie.setFlyBehavior(new FlyNoWay());
                                            rubberDuckie.performFly();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 2:
                                    System.out.println("1- Swim");
                                    System.out.println("2- SwimWithLifeJacket");
                                    System.out.println("3- SwimWithMotor");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            rubberDuckie.setSwimBehavior(new Swim());
                                            rubberDuckie.performSwim();
                                            break;
                                        case 2:
                                            rubberDuckie.setSwimBehavior(new SwimWithLifeJacket());
                                            rubberDuckie.performSwim();
                                            break;
                                        case 3:
                                            rubberDuckie.setSwimBehavior(new SwimWithMotor());
                                            rubberDuckie.performSwim();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 3:
                                    System.out.println("1- Quack");
                                    System.out.println("2- MuteQuack");
                                    System.out.println("3- Squeak");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            rubberDuckie.setQuackBehavior(new Quack());
                                            rubberDuckie.performQuack();
                                            break;
                                        case 2:
                                            rubberDuckie.setQuackBehavior(new MuteQuack());
                                            rubberDuckie.performQuack();
                                            break;
                                        case 3:
                                            rubberDuckie.setQuackBehavior(new Squeak());
                                            rubberDuckie.performQuack();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + opc);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opc);
                    }
                    break;

                case 3:
                    System.out.println("1- volar");
                    System.out.println("2- nadar");
                    System.out.println("3- graznar");
                    System.out.println("4- cambiar comportamiento");
                    System.out.println("Ingrese una opcion: ");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            redhead.performFly();
                            break;
                        case 2:
                            redhead.performSwim();
                            break;
                        case 3:
                            redhead.performQuack();
                            break;
                        case 4:
                            System.out.println("1- cambiar volar");
                            System.out.println("2- cambiar nadar");
                            System.out.println("3- cambiar graznar");
                            System.out.println("Ingrese una opcion: ");
                            opc = leer.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("1- FlyWithWings");
                                    System.out.println("2- FlyRocketPowered");
                                    System.out.println("3- FlyNoWay");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            redhead.setFlyBehavior(new FlyWithWings());
                                            redhead.performFly();
                                            break;
                                        case 2:
                                            redhead.setFlyBehavior(new FlyRocketPowered());
                                            redhead.performFly();
                                            break;
                                        case 3:
                                            redhead.setFlyBehavior(new FlyNoWay());
                                            redhead.performFly();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 2:
                                    System.out.println("1- Swim");
                                    System.out.println("2- SwimWithLifeJacket");
                                    System.out.println("3- SwimWithMotor");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            redhead.setSwimBehavior(new Swim());
                                            redhead.performSwim();
                                            break;
                                        case 2:
                                            redhead.setSwimBehavior(new SwimWithLifeJacket());
                                            redhead.performSwim();
                                            break;
                                        case 3:
                                            redhead.setSwimBehavior(new SwimWithMotor());
                                            redhead.performSwim();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 3:
                                    System.out.println("1- Quack");
                                    System.out.println("2- MuteQuack");
                                    System.out.println("3- Squeak");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            redhead.setQuackBehavior(new Quack());
                                            redhead.performQuack();
                                            break;
                                        case 2:
                                            redhead.setQuackBehavior(new MuteQuack());
                                            redhead.performQuack();
                                            break;
                                        case 3:
                                            redhead.setQuackBehavior(new Squeak());
                                            redhead.performQuack();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + opc);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opc);
                    }
                    break;

                case 4:
                    System.out.println("1- volar");
                    System.out.println("2- nadar");
                    System.out.println("3- graznar");
                    System.out.println("4- cambiar comportamiento");
                    System.out.println("Ingrese una opcion: ");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            decoy.performFly();
                            break;
                        case 2:
                            decoy.performSwim();
                            break;
                        case 3:
                            decoy.performQuack();
                            break;
                        case 4:
                            System.out.println("1- cambiar volar");
                            System.out.println("2- cambiar nadar");
                            System.out.println("3- cambiar graznar");
                            System.out.println("Ingrese una opcion: ");
                            opc = leer.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("1- FlyWithWings");
                                    System.out.println("2- FlyRocketPowered");
                                    System.out.println("3- FlyNoWay");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            decoy.setFlyBehavior(new FlyWithWings());
                                            decoy.performFly();
                                            break;
                                        case 2:
                                            decoy.setFlyBehavior(new FlyRocketPowered());
                                            decoy.performFly();
                                            break;
                                        case 3:
                                            decoy.setFlyBehavior(new FlyNoWay());
                                            decoy.performFly();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 2:
                                    System.out.println("1- Swim");
                                    System.out.println("2- SwimWithLifeJacket");
                                    System.out.println("3- SwimWithMotor");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            decoy.setSwimBehavior(new Swim());
                                            decoy.performSwim();
                                            break;
                                        case 2:
                                            decoy.setSwimBehavior(new SwimWithLifeJacket());
                                            decoy.performSwim();
                                            break;
                                        case 3:
                                            decoy.setSwimBehavior(new SwimWithMotor());
                                            decoy.performSwim();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 3:
                                    System.out.println("1- Quack");
                                    System.out.println("2- MuteQuack");
                                    System.out.println("3- Squeak");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            decoy.setQuackBehavior(new Quack());
                                            decoy.performQuack();
                                            break;
                                        case 2:
                                            decoy.setQuackBehavior(new MuteQuack());
                                            decoy.performQuack();
                                            break;
                                        case 3:
                                            decoy.setQuackBehavior(new Squeak());
                                            decoy.performQuack();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + opc);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opc);
                    }
                    break;
                case 5:
                    System.out.println("1- volar");
                    System.out.println("2- nadar");
                    System.out.println("3- graznar");
                    System.out.println("4- cambiar comportamiento");
                    System.out.println("Ingrese una opcion: ");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            model.performFly();
                            break;
                        case 2:
                            model.performSwim();
                            break;
                        case 3:
                            model.performQuack();
                            break;
                        case 4:
                            System.out.println("1- cambiar volar");
                            System.out.println("2- cambiar nadar");
                            System.out.println("3- cambiar graznar");
                            System.out.println("Ingrese una opcion: ");
                            opc = leer.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("1- FlyWithWings");
                                    System.out.println("2- FlyRocketPowered");
                                    System.out.println("3- FlyNoWay");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            model.setFlyBehavior(new FlyWithWings());
                                            model.performFly();
                                            break;
                                        case 2:
                                            model.setFlyBehavior(new FlyRocketPowered());
                                            model.performFly();
                                            break;
                                        case 3:
                                            model.setFlyBehavior(new FlyNoWay());
                                            model.performFly();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 2:
                                    System.out.println("1- Swim");
                                    System.out.println("2- SwimWithLifeJacket");
                                    System.out.println("3- SwimWithMotor");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            model.setSwimBehavior(new Swim());
                                            model.performSwim();
                                            break;
                                        case 2:
                                            model.setSwimBehavior(new SwimWithLifeJacket());
                                            model.performSwim();
                                            break;
                                        case 3:
                                            model.setSwimBehavior(new SwimWithMotor());
                                            model.performSwim();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                case 3:
                                    System.out.println("1- Quack");
                                    System.out.println("2- MuteQuack");
                                    System.out.println("3- Squeak");
                                    System.out.println("Ingrese una opcion: ");
                                    opc = leer.nextInt();
                                    switch (opc) {
                                        case 1:
                                            model.setQuackBehavior(new Quack());
                                            model.performQuack();
                                            break;
                                        case 2:
                                            model.setQuackBehavior(new MuteQuack());
                                            model.performQuack();
                                            break;
                                        case 3:
                                            decoy.setQuackBehavior(new Squeak());
                                            decoy.performQuack();
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + opc);
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + opc);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opc);
                    }
                    break;

                case  6:
                    band = 1;
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opc);
            }
        }
    }
}
