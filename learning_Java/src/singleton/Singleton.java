package singleton;


class CoffeeMachine {
    private float cofeeQty;
    private float waterQty;
    private float sugarQty;
    private float milkQty;
    public static CoffeeMachine myCofeeMachine = null;

    private CoffeeMachine() {
        cofeeQty=2;
        waterQty=1;
        sugarQty=1;
        milkQty=2;
    }
    public void fillCofee(float cofeeQty) {
        this.cofeeQty = cofeeQty;
    }
    public void fillWater(float waterQty) {
        this.waterQty = waterQty;
    }
    public void fillSugar(float sugarQty) {
        this.sugarQty = sugarQty;
    }
    public void fillMilk(float milkQty) {
        this.milkQty = milkQty;
    }

    public float getCofee() {
        return (waterQty+milkQty+sugarQty+cofeeQty);
    }
    public static CoffeeMachine getInstance() {
        if (myCofeeMachine == null) {
            myCofeeMachine = new CoffeeMachine();
        }
        return myCofeeMachine;
    }
}
public class Singleton {
    public static void main (String []args) {
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();

        System.out.println("printing cm1.getCofee: "+cm1.getCofee());
        cm2.fillCofee(3);
        cm2.fillMilk(4);
        System.out.println("printing cm2.getCofee: "+cm2.getCofee());
        System.out.println("printing cm3.getCofee: "+cm3.getCofee());
        System.out.println("printing cm1.getCofee again: "+cm1.getCofee());
        if ((cm1 == cm2)&& (cm1 == cm3)) {
            System.out.println("same instances references");
        }
    }
}
