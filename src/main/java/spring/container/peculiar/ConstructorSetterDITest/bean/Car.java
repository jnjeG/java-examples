package spring.container.peculiar.ConstructorSetterDITest.bean;

/**
 * Created by Administrator on 2016/3/9.
 */
public class Car {
    private Engine engine;
    private Wheel wheel;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("construct engine");
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("set wheel");
    }
}
