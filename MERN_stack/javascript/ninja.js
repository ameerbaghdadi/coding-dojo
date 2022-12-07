class Ninja {
    constructor(name, health) {
        this.name = name;
        this.health = health;
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log("Ninja Name is: " + this.name);
    }

    showStats() {
        console.log("Ninja Name is: "+ this.name + ", Ninja Health: " + this.health + ", Ninja Speed: " + this.speed + ", Ninja Strength: " + this.strength);
    }

    drinkSake() {
        this.health += 10;
    }
}

const ninja1 = new Ninja("Hyabusa", 99);
ninja1.sayName();
ninja1.drinkSake();
ninja1.showStats();