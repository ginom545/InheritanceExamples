public class Main 
{
  public static void main(String[] args) 
  {

    // TOSTRING AND EQUALS PRACTICE (NO INHERITANCE INVOLVED YET)

    /*
    // create a Product with any values for its properties
    // store this into a variable called p
    Product p = new Product("Febreeze", "febreeze.com", "Air freshener", 6.99, 2);

    // print p (automatically / implicitly calls Product toString method)
    // this is the way toString is normally used
    // often used to inspect the values of an object's properties
    System.out.println(p);

    // although toString is normally called implicitly with print
    // we can evoke the toString explicitly if we need to
    String objectInfo = p.toString();

    // create a Product p2 such that calling p.equals(p2) would return true
    // ONLY make the properties match on the properties that are relevant to the equals method
    Product p2 = new Product("Febreeze", "febreeze.com", "Odor destroyer", 5.45, 1);

    // print the result of p.equals(p2) (prints true because name and URL match, even though the other properties differ)
    System.out.println(p.equals(p2));

    // create a Product p3 which has ALL of the same values as p
    // EXCEPT a different URL
    Product p3 = new Product("Febreeze", "febreeze.net", "Air freshener", 6.99, 2);

    // print the result of p.equals(p3) (prints false simply because URL does not match, even though other properties match)
    System.out.println(p.equals(p3));
    */

    // PRACTICE CREATING AND PRINTING PARENT AND CHILD OBJECTS

    // create a Product object ... give it any values for its properties
    // create a VideoGame object ... give it any values for its properties
    // create a Movie object ... give it any values for its properties
    Product p4 = new Product("Cheerios", "cheerios.com", "Cereal", 4.99, 1);
    VideoGame g = new VideoGame("Xbox game", "xbox.com", "The best video game", 19.99, 3, "Minecraft", "Xbox 360", 'e', "Adventure");
    Movie m = new Movie("Bluray DVD", "walmart.com", "Action-packed movie", 9.99, 2, "Mission Impossible", "Brian De Palma", "PG 13", "Action");

    // print all of these objects
    // note that, currently, without a version of toString in the child classes,
    // this calls the parent class's (Product's) version of toString
    // so we won't see any of the child class properties printed out here
    System.out.println(p4);
    System.out.println();
    System.out.println(g);
    System.out.println();
    System.out.println(m);

    // print the result of calling getDiscountedPrice on each object
    System.out.println(p4.getDiscountedPrice());
    System.out.println(m.getDiscountedPrice());
    System.out.println(g.getDiscountedPrice());

    
    
  }
}