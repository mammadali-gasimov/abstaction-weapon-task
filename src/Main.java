import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bullet count that we have:");
        int bulletCount = scanner.nextInt();

        System.out.println("Enter maximum bullet capacity:");
        int capacity = scanner.nextInt();

        System.out.println("Enter bullet count in the comb:");
        int bulletsInComb = scanner.nextInt();
        while (bulletsInComb > capacity) {
            System.out.println("Enter bullet count in the comb:");
            bulletsInComb = scanner.nextInt();
        }

        AK47 ak47 = new AK47(bulletCount, capacity, bulletsInComb);
        while (ak47.bulletCount + ak47.bulletInComb > 0) {
            ak47.openFire();
            System.out.println("Bullets in comb: " + ak47.bulletInComb + ". Bullets count: " + ak47.bulletCount);
            if (ak47.bulletInComb == 0) {
                System.out.println("How many bullets you want to reload with?");
                int reloadAmount = scanner.nextInt();
                ak47.makeReload(reloadAmount);
            }
        }
    }
}