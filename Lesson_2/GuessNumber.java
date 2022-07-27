import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("\nИгра началась!!!");
        do {
            System.out.print("Число игрока " + player1.getName() + " : ");
            player1.setNumber(sc.nextInt());
            if (checkTargetNumber(player1)) {
                break;
            }
            System.out.print("Число игрока " + player2.getName() + " : ");
            player2.setNumber(sc.nextInt());
            if (checkTargetNumber(player2)) {
                break;
            }
        } while (true);
    }

    private boolean checkTargetNumber(Player player) {
        if(player.getNumber() <= 0 || player.getNumber() > 100) {
            System.out.println("Введите корректное число!");
            return false;
        } else if(player.getNumber() == targetNumber) {
            System.out.println(player.getName() + " победил!");
            return true;
        } else if(player.getNumber() > targetNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}