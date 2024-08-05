class Distance {
    private int km, meter;

    // Constructor to initialize Distance object
    public Distance(int km, int meter) {
        this.km = km;
        this.meter = meter;
    }

    // Default constructor
    public Distance() {
        this.km = 0;
        this.meter = 0;
    }

    // Method to add two Distance objects
    public Distance add(Distance k) {
        Distance temp = new Distance();
        temp.km = this.km + k.km;
        temp.meter = this.meter + k.meter;

        if (temp.meter >= 1000) {
            temp.km++;
            temp.meter -= 1000;
        }

        return temp;
    }

    // Method to display distance
    public void display() {
        System.out.println("Kilometers: " + km + ", Meters: " + meter);
    }
}

class D1{
    public static void main(String[] args) {
        Distance d1 = new Distance(6, 350);
        Distance d2 = new Distance(2, 200);

        Distance result = d1.add(d2);

        result.display(); // Displaying the result
    }
}
