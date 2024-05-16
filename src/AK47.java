public class AK47 extends Weapon implements Fireable {
    public AK47(int bulletCount, int capacity, int bulletInComb) {
        this.bulletCount = bulletCount;
        this.capacity = capacity;
        this.bulletInComb = bulletInComb;
    }

    @Override
    public void makeReload(int reloadAmount) {
        if (reloadAmount <= capacity) {
            bulletCount -= reloadAmount;
            bulletInComb += reloadAmount;
        } else {
            System.out.println("Amount can not be more than capacity!");
        }
    }

    @Override
    public void openFire() {
        if (bulletInComb > 0) {
            bulletInComb -= 1;
        }
    }
}
