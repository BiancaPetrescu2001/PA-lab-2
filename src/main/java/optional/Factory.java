package optional;

public class Factory extends Source {
    /**
     *
     * @param sourceName = the name of the factory
     * @param supply = the supply of one factory
     */
    Factory(String sourceName, int supply) {
        this.sourceName = sourceName;
        this.type = "factory";
        this.supply = supply;
    }

    @Override
    public void setType(String type) {
        type = "factory";
        this.type = type;
    }
}
