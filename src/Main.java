import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.println("У игрока 5 слотов с оружием, ");
        System.out.println("введите номер от 0 до 4, чтобы выстрелить ");
        System.out.println("введите -1, чтобы выйти из программы");
        player.getSlotsCount();
        int slot;

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over");
                break;
            } else {
                player.shotWithWeapon(slot);
            }
        }

    }
}