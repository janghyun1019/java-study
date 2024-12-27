package study.practice.prac30.me;

class Food {
    private String name;
    private int price;
    private int stock;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        this.stock += amount;
    }

    public boolean reduceStock(int amount) {
        if (stock >= amount) {
            stock -= amount;
            return true;
        }
        return false;
    }

    public int calculateWasteCost() {
        return (int) (stock * price * 0.3);
    }
}