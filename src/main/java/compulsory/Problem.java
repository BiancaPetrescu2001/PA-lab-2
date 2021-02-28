package compulsory;

import java.util.Arrays;

public class Problem {
    private Source[] sources;
    private Destination[] destinations;
    private int[][] cost;

    /**
     * @param sources      : an array of sources
     * @param destinations : an array of destinations
     * @param cost         : a matrix of costs
     */
    Problem(Source[] sources, Destination[] destinations, int[][] cost) {

        this.sources = sources;
        this.destinations = destinations;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "Problem: {" +
                "sources=" + Arrays.toString(sources) +
                ", destinations=" + Arrays.toString(destinations) +
                ", cost=" + Arrays.deepToString(cost) +
                '}';
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public int[][] getCost() {
        return cost;
    }

    public Source[] getSources() {
        return sources;
    }
    public void printInstance() {
        System.out.println(toString());
        System.out.println();
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.print(sources[i].getSupply());
            System.out.println();
        }
        for (int i = 0; i < destinations.length; i++) {
            System.out.print(destinations[i].getDemand() + " ");
        }
        System.out.println();
    }

}
