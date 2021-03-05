package optional;

public class Destination {
    private String destinationName;
    private int demand;

    Destination(String name, int demand) {
        this.destinationName = name;
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "Destination: " + destinationName + ", " + demand;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination des = (Destination) obj;
        if (this.destinationName.compareTo(des.destinationName) != 0)
            return true;
        return false;
    }

    public void setName(String name) {
        this.destinationName = name;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getDemand() {
        return demand;
    }

    public String getName() {
        return destinationName;
    }
}
