import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        final int MIN_SPEED = 1;
        final int MAX_SPEED = 250;

        final int MAX_CARS = 3;

        for (int i = 0; i < MAX_CARS; i++) {
            System.out.println("Введите название автомобиля " + i + ": ");
            String name = scanner.nextLine();

            int speed = 0;

            while (true) {
                System.out.println("Введите скорость автомобиля " + i + " (от " + MIN_SPEED + " до " + MAX_SPEED + "): ");
                try {
                    speed = Integer.parseInt(scanner.nextLine());
                    if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 1 до 250.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число.");
                }
            }

            Car car = new Car(name, speed);
            race.checkWinner(car);
        }

        System.out.println("Самая быстрая машина: " + race.getWinnerName());
    }
}