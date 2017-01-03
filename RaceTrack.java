public class RaceTrack {
  public static void main (String[] args){
     /* declaring two variables that will
      * take as input the large radius and 
      * the number of lanes through args
      * (once converted into double and int from string) */
     double largeRadius = Double.parseDouble(args[0]);
     int numLanes = Integer.parseInt(args[1]);
     // the width of each lane is 2.8 meters;
     /* the paved area would be the total area (with large radius)
      * minus the area of the inner (unpaved) region*/
     double pavedArea = ((Math.PI * largeRadius * largeRadius) - (Math.PI * (largeRadius - numLanes * 2.8) * (largeRadius - numLanes * 2.8)));
     System.out.println("Total area : " + pavedArea + " square meters");
     // cost of asphalt is 7.49$ per square meter
     // to find the subtotal, we multiply the paved area with the cost per square meter
     double subtotal = (pavedArea * 7.49);
     System.out.println("Subtotal : " + subtotal + "$");
     // to find the amount of sales tax, we multiply the subtotal with 0.15
     double salesTax = (subtotal * 0.15);
     System.out.println("Sales Tax (15%) : " + salesTax + "$");
     // to find the total, add the subtotal and sales tax amount
     double total = (subtotal + salesTax);
     /* since we have to round up the total, we use Math.ceil()
      * we then store it in a variable called roundedTotal */
     double roundedTotal = Math.ceil(total);
     // we then convert roundedTotal to an int by Casting
     int finalTotal = (int) roundedTotal;
     // finally, we print the total amount to the screen
     System.out.println("Total : " + finalTotal + "$");
  }
}