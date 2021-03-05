package optional;

public class Warehouse extends Source {
    /**
     *
     * @param sourceName = the name of the specific source
     * @param supply = the supply of one specific source
     */
    Warehouse(String sourceName, int supply) {
        this.sourceName = sourceName;
        this.type = "warehouse";
        this.supply = supply;
    }

    @Override
    public void setType(String type) {
        type = "warehouse";
        this.type = type;
    }
}
