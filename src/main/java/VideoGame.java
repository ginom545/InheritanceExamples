public class VideoGame extends Product
{

  // the VideoGame child class adds these new properties:
  public String title;
  public String console;
  public char esrb;
  public String genre;

  public static final double GAME_DISCOUNT = 0.45;

  // this version of a constructor wouldn't work
  // this constructor is only accepting values for the child class properties
  // this fails because we need to also accept values for the parent class properties
  /*
  public VideoGame(String title, String console, char esrb, String genre)
  {
    this.title = title;
    this.console = console;
    this.esrb = esrb;
    this.genre = genre;
  }
  */

  // this next constructor technically works but ... 
  // THIS IS THE WRONG WAY TO WRITE THE CLASS CONSTRUCTOR
  // writing a constructor this way would be a bad habit!
  // here we are NOT using the super keyword
  // this implementation assumes that all we need to do with the parent properties
  // is set them equal to their parameter values
  // which ... realistically, a lot of the time, that is all the parent constructor does
  // BUT if the parent constructor did anything else, or maybe even later changed,
  // this code would not be accurate ... it would not be setting up parent properties correctly
  // SO DONT DO IT THIS WAY!
  // do it the "right way" (see below)
  /*
  public VideoGame(String productName, String productURL, String description, double cost, int shippingDays, String title, String console, char esrb, String genre)
  {
    this.productName = productName;
    this.productURL = productURL;
    this.description = description;
    this.cost = cost;
    this.title = title;
    this.console = console;
    this.esrb = esrb;
    this.genre = genre;
  }
  */

  // THIS IS THE RIGHT WAY TO WRITE THE CLASS CONSTRUCTOR
  // you have to write the child class constructor such that it accepts parameters for
  // ALL of the parent class properties
  // AND
  // ALL of the child class properties
  // this is repetitive, tediuous if there is a lot of properties ... womp womp, we gott do it anyways, that's how it's done
  public VideoGame(String productName, String productURL, String description, double cost, int shippingDays, String title, String console, char esrb, String genre)
  {
    // this calls the parent class Product's constructor
    // this basically says "setup the parent properties as the parent constructor does"
    super(productName, productURL, description, cost, shippingDays);
    this.title = title;
    this.console = console;
    this.esrb = esrb;
    this.genre = genre;
  }

  public double getDiscountedPrice()
  {
    System.out.println("VideoGame getDiscountedPrice");
    double newPrice = super.getDiscountedPrice();
    newPrice = newPrice - GAME_DISCOUNT;
    if (newPrice < 0)
    {
      return 0;
    }
    return newPrice;
  }
  
}