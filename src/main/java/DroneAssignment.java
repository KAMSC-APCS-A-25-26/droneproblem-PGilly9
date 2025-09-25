/*Part 1 – Casting
The drone's display screen can only show whole numbers.

Cast the altitude (double) into an int called displayAltitude
Cast the battery (double) into an int called batteryRounded
Print them to check your work (optional)
Part 2 – Compound Assignment Operators
Simulate changes during the flight using compound operators:

Altitude: Drone climbs 20 meters
Battery: Battery drains 15 percentage points (subtract 15 from battery value)
Photos: Drone takes 3 photos
Altitude: Drone descends to half its current altitude
Photos: Use modulo to calculate storage slots used on photos
Part 3 – Display Results
Display the final results with flexible wording, but must include:

Photos: Show the final photo count
Storage slots used: Show "Storage slots used: X out of 4" (exact phrase required)

 */

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;
        
        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();
        
        // TODO: Part 1 - Casting
        // Cast altitude (double) to int called displayAltitude
        int displayAltitude = (int) altitude;
        // Cast battery (double) to int called batteryRounded
        int batteryRounded = (int) battery;
        // Print them to check your work (optional)



        System.out.println("Battery rounded is:  " + batteryRounded );
        System.out.println("Displayed altitude is:  " + displayAltitude);
        
        // TODO: Part 2 - Compound Assignment Operators
        // Altitude: Drone climbs 20 meters
        altitude += 20;
        System.out.println("Altitude after climbing 20 is:  " + altitude);
        // Battery: Battery drains 15%
        battery *= 0.85;
        System.out.println("Battery after draining 15% is:  " + battery);
        // Photos: Drone takes 3 photos
        photos += 3;
        System.out.println("Photos after drone takes 3 photos is:  " + photos);
        // Altitude: Drone descends to half its current altitude
        altitude *= 0.5;
        System.out.println("Altitude after descending half its height is:  " + altitude);
        // use modulo to calculate storage slots used on photos to calculate storage slots used
        int slotsUsed = photos % 4;
        // Display "Photos: " + photos
        System.out.println("Photos:  " + photos);
        // Display "Storage slots used: " + photos + " out of 4"
        System.out.println("Storage slots used:  " + photos + "out of 4");

    }
}
