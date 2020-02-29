import fly.*;
import sound.*;
import attack.*;
import defend.*;

public class Main {
    public static void main(String[] args) {
        Duck superDuck = new Duck (new RocketFly(), new ToaSound(), new ArrowAttack(),new ShieldDefend());
        System.out.println("Super Duck Behaviour : ");
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defend();
        
        System.out.println("");
        System.out.println("Noob Duck Behaviour : ");
        Duck noobDuck = new Duck (new WingsFly(), new NormalSound(), new SwordAttack(),new ArmorDefend());
        noobDuck.fly();
        noobDuck.sound();
        noobDuck.attack();
        noobDuck.defend();
        
        System.out.println("");
        System.out.println("Super Duck Change Fly Behaviour : ");
        superDuck.setFlyBehaviour(new PlaneFly());
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defend();
    }
    
}
