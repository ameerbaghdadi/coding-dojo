function pizzaOven(crustType, sauceType, cheeses, toppings) {
    var pizza = {
        crustType: crustType,
        sauceType: sauceType,
        cheeses: cheeses,
        toppings: toppings,
        orderIsReady() {
            console.log("Your PIZZA is Done: " + pizza.crustType + " " + pizza.sauceType + " " + pizza.cheeses + " " + pizza.toppings)
        },
    };
    return pizza;
}

var firstPizza = pizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
firstPizza.orderIsReady();

var secondPizza = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
secondPizza.orderIsReady();

var thirdPizza = pizzaOven("Maxico Pizza", "BBQ", ["Mozzarella, haloom"], ["Tomato, mushrooms, onions, chicken, spicy"],);
thirdPizza.orderIsReady();

var forthPizza = pizzaOven("Margharita Pizza", "italy sauce", ["italy chees, Mozzarella"], ["Bazil, Tomato"])
forthPizza.orderIsReady();
