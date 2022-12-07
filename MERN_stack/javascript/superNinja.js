class Ninja {
    constructor(name, health, speed, strength) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.strength = strength;
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

class Sensei extends Ninja {
    constructor(name) {
        super(name, 200, 10, 10);
    }

    speakWisdom() {
        const stats = super.drinkSake();
        console.log("What one programmer can do in one month, two programmers can do in two months.");
    }
}

const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
// -> "What one programmer can do in one month, two programmers can do in two months."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"
