public class RunCar {
    private int modelYear;
    private String modelName;
  
    public RunCar(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
 
      Car dadCar = new Car("Honda", "Odessey", "Blue", 2016, "Dad");
      System.out.println("Dad's new car is " + dadCar.getColor());
      System.out.println("Dad wants to paint his car");
      // Code to change car color
      dadCar.setColor("Purple");
      dadCar.setOwner("bob");
      System.out.println("Dad's car's color is now " + dadCar.getColor());
      System.out.println("Dad's car is from " + dadCar.getYear());
      System.out.println("Dad has now given his car to " + dadCar.getOwner());
      Car ibiCar = new Car("Pinto", "Pinter", "Rusty", 1952, "Ibrahim");
      System.out.println("Dads car is " + dadCar.getModel() +" "+ dadCar.getYear() + " and Ibrahim's car is " + ibiCar.getModel() + " " + ibiCar.getYear()); 
    }
}
  