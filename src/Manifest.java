public class Manifest {
    private final Passenger[] passengers = new Passenger[12];

    public boolean insertPassenger(String name, int age) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = new Passenger(name, age);
                System.out.println("Passenger inserted in seat " + (i + 1) + ".");
                return true;
            }
        }
        System.out.println("No available seats.");
        return false;
    }

    public boolean removePassenger(int seatNumber) {
        if (seatNumber < 1 || seatNumber > passengers.length) {
            System.out.println("Invalid seat number.");
            return false;
        }
        if (passengers[seatNumber - 1] != null){
            passengers[seatNumber -1] = null; 
            System.out.println("Passenger removed from seat " + seatNumber + "." );
            return true; 
        }
        System.out.println("Seat " + seatNumber + "is already empty.");
        return false ;
    }

    public boolean switchSeats(int seat1, int seat2) {
        if (seat1 < 1 || seat1 > passengers.length || seat2 < 1 || seat2 > passengers.length) {
            System.out.println("Invalid seat numbers.");
            return false;
        }
        Passenger temp = passengers[seat1 - 1];
        passengers[seat1 - 1] = passengers[seat2 - 1];
        passengers[seat2 - 1] = temp;
        return true;
    }

    public boolean renamePassenger(int seatNumber, String newName) {
        if (seatNumber < 1 || seatNumber > passengers.length){
            System.out.println("Invalid seat number.");
            return false;

        }
        if (passengers[seatNumber - 1] != null) {
            passengers[seatNumber - 1].setName(newName);
            System.out.println("Passenger in seat " + seatNumber + " renamed to " + newName + ".") ;
            return true;
        }

        System.out.println("Seat " + seatNumber + "is empty.");
        return false;
    }

    public int countPassengers() {
        int count = 0;
        for (Passenger passenger : passengers) {
            if (passenger != null) {
                count ++;
            }
        }
        return count; 
    }

    public void printManifest() {
        System.out.println("##### PASSENGER MANIFEST #####");
        System.out.println("Skybox Ltd.");
        System.out.println("Seat\tName\tAge");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                System.out.println((i + 1) + "\t" + passengers[i].getName() + "\t" + passengers[i].getAge());
            } else {
              System.out.println((i + 1) + "\t" + "Empty");  
            }
        }
        System.out.println("##### ##### ##### ##### ##### ###");
    }
}
