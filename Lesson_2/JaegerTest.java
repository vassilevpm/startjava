public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setOrigin("Russia");
        jaeger1.setSpeed(3);
        System.out.println("Launched in 2015, " + jaeger1.getModelName() + 
                " is tasked with defending " + jaeger1.getOrigin());
        jaeger1.showStatus();

        Jaeger jaeger2 = new Jaeger("Horizon Brave", "China", 8);
        System.out.println("Like all Mark-1 Jaegers, " + jaeger2.getModelName() + 
                " is powered by a nuclear reactor and it's speed is about " + jaeger2.getSpeed());
        jaeger2.showStatus();
    }
}