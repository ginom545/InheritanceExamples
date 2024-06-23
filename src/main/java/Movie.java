public class Movie extends Product
{
  
  public String title;
  public String directorName;
  public String rating;
  public String genre;

  // create a static double constant called MOVIE_DISCOUNT and set it equal to 0.75
  public static final double MOVIE_DISCOUNT = 0.75;
  
  public Movie(String productName, String productURL, String description, double cost, int shippingDays, String title, String directorName, String rating, String genre)
  {
    super(productName, productURL, description, cost, shippingDays);
    this.title = title;
    this.directorName = directorName;
    this.rating = rating;
    this.genre = genre;
  }

  // override the getDiscountedPrice method
  public double getDiscountedPrice()
  {
    System.out.println("Movie getDiscountedPrice");
    double newPrice = super.getDiscountedPrice();
    newPrice = newPrice - MOVIE_DISCOUNT;
    if (newPrice < 0)
    {
      return 0;
    }
    return newPrice;
  }

  // override the toString method
  public String toString()
  {
    // call the parent class's version of toString
    // and store the return value into a String variable called result
    String result = super.toString();
    return result + "\nTitle: " + this.title + "\nDirector: " + this.directorName + "\nRating: " + this.rating + "\nGenre: " + this.genre;
  }
  
}