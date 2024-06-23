public class Product
{

  public String productName;
  public String productURL;
  public String description;
  public double cost;
  public int shippingDays;

  public static final double PRODUCT_DISCOUNT = 0.5;
  
  public Product(String productName, String productURL, String description, double cost, int shippingDays)
  {
    this.productName = productName;
    this.productURL = productURL;
    this.description = description;
    this.cost = cost;
    this.shippingDays = shippingDays;
  }
  
  public String toString()
  {
    return "Name: " + productName + "\nURL: " + productURL + "\nDescription: " + description + "\nCost: " + cost + "\nDelivery: " + shippingDays + " days";
  }

  // Object's version of .equals is just using ==
  
  public boolean equals(Object other)
  {

    if(other == null)
    {
      return false;
    }
      
    if (!(other instanceof Product))
    {
      return false;
    }

    Product otherProduct = (Product) other;

    return this.productName.equals(otherProduct.productName) && this.productURL.equals(otherProduct.productURL);
    
  }

  // calculate this Product's cost after receiving PRODUCT_DISCOUNT
  // if the cost would be negative, instead return 0 (free)
  public double getDiscountedPrice()
  {
    System.out.println("Product getDiscountedPrice");
    double newCost = this.cost - PRODUCT_DISCOUNT;
    if (newCost < 0)
    {
      return 0;
    }
    return newCost;
  }
}