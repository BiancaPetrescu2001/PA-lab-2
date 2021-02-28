package compulsory;

public class Source {
    private String sourceName;
    private SourceType type;
    private int supply;

    public Source(String sourceName, SourceType type, int supply) {
        this.sourceName = sourceName;
        this.type = type;
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Source: " + sourceName + ", " + type + ", " + supply;
    }
    public void setName(String name) {
        this.sourceName = name;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public String getName() {
        return sourceName;
    }

    public int getSupply() {
        return supply;
    }

    public SourceType getType() {
        return type;
    }
}
