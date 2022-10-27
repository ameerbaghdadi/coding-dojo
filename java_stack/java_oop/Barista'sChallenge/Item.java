public class Item {
    private String name;
    private double price;
    
    public Item() {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println("Item name is : "+this.name+", Item price: "+this.price);
    }

    public void setItemName(String name){
        this.name = name;
    }

    public String getItemName(){
        return this.name;
    }

    public void setItemPrice(double price){
        this.price = price;
    }

    public double getItemPrice(){
        return this.price;
    }
}