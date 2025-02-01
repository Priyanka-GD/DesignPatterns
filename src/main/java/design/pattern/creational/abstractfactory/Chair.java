package design.pattern.creational.abstractfactory;

public interface Chair {
    void sitOn();

    void hasLegs();
}

class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }

    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has legs");
    }
}

class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }

    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has legs");
    }
}