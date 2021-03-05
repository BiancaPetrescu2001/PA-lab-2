package optional;

public class Warehouse extends Source {
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
