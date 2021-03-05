package optional;

public class Solution {
    private Source[] sources;
    private Destination[] destinations;
    private int[][] cost;

    public Solution(Problem p) {
        this.sources = p.getSources();
        this.destinations = p.getDestinations();
        this.cost = p.getCost();
    }

    /**
     *
     * @return the algorithm returns the total cost of the problem
     */
    public int solve() {

        int solution = 0;

        int totalDemand = 0;
        for (int i = 0; i < cost.length; i++)
            totalDemand += destinations[i].getDemand();

        while (totalDemand != 0) {
            int minim = Integer.MAX_VALUE, imin = 0, jmin = 0;
            for (int i = 0; i < cost.length; i++) {
                if (sources[i].getSupply() == 0)
                    continue;
                for (int j = 0; j < cost.length; j++) {
                    if (destinations[j].getDemand() == 0)
                        continue;
                    if (cost[i][j] < minim) {
                        minim = cost[i][j];
                        imin = i;
                        jmin = j;
                    }
                }
            }

            int m = Math.min(sources[imin].getSupply(), destinations[jmin].getDemand());
            totalDemand -= m;
            solution += minim * m;
            sources[imin].setSupply(sources[imin].getSupply() - m);
            destinations[jmin].setDemand(destinations[jmin].getDemand() - m);


        }

        return solution;
    }

}
