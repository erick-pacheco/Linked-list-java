import java.util.LinkedList;

class Main {
  public static void main(String[] args) {

    LinkedList<String> animals = new LinkedList<String>();
    String[] toBeAdded = { "Cat", "Dog", "Mouse", "Wolf" };

    for (String animal : toBeAdded) {
      animals.add(animal);
    }

    /* Step 4 */
    animals.addFirst("Beaver");

    /* Step 5 */
    animals.add(3, "Frog");

    for (int i = 0; i < animals.size(); i++) {
      log(animals.get(i));
    }

    /* Step 6 */
    LinkedList<String> planets = new LinkedList<String>();
    String[] planetArr = { "Sun", "Mercury", "Venus", "Earth", "Moon", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune",
        "Pluto" };

    for (String planet : planetArr) {
      planets.add(planet);
    }

    /* Step 8-12 */
    planets.removeFirst();
    planets.remove("Moon");
    planets.removeLast();

    for (String planet : planets) {
      log(planet);
    }

    planets.addLast("Pluto");

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}