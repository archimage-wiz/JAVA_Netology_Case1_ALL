import Weapons.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока" 

    private final Weapon[] weaponSlots;
    
    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            // TODO заполнить слоты оружием
            // new BigGun(),
            // new WaterPistol()
            new Pistol(),
            new Riffle(),
            new Rpg(),
            new SlingShoot(),
            new WaterPistol()
        };
    }
    
    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
    
    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot > weaponSlots.length-1 || slot < 0) {
            System.out.println("Incorrect slot!");
            return;
        }
        // Получаем оружие из выбранного слота
        //Weapon weapon = weaponSlots[slot];
        // Огонь!
        weaponSlots[slot].shot();
    }
}