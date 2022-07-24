public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.name = "Белый клык";
        wolf.weight = 5.5;
        wolf.age = 3;
        wolf.color = "Белый";

        System.out.println("Волка зовут " + wolf.name);
        System.out.println("Вес волка составляет " + wolf.weight + " кг");
        System.out.println("Возраст волка " + wolf.age + " года");
        System.out.println("Окрас " + wolf.color);

        System.out.print(wolf.name + " ");
        wolf.hawl();
        System.out.print(wolf.name + " ");
        wolf.hunt();
    }
}