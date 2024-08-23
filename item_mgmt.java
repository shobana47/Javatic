class Item {
  private String name;
  private double price;
 
  private static int totalItemsSold = 0;
  private static double totalRevenue = 0.0;

  public Item(String name, double price) {
      this.name = name;
      this.price = price;
  }

  public void sell(int quantity) {
      totalItemsSold += quantity;
      totalRevenue += quantity * this.price;
  }

  public static int getTotalItemsSold() {
      return totalItemsSold;
  }

  public static double getTotalRevenue() {
      return totalRevenue;
  }
}

public class item_mgmt {
  public static void main(String[] args) {

      System.out.println(" ");
      System.out.println("ITEM MANAGEMENT");

      Item laptop = new Item("Laptop", 1000.0);
      
      laptop.sell(2);
      
      System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
      
      System.out.println("Total Revenue: $" + Item.getTotalRevenue());
  }
}
