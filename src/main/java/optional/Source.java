package optional;


abstract class Source {
    protected String sourceName;
    protected String type;
    protected int supply;


    @Override
    public String toString() {
        return "Source: " + sourceName + ", " + type + ", " + supply;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Source)) {
            return false;
        }
        Source sou = (Source) obj;
        if (this.sourceName.compareTo(sou.sourceName) != 0)
            return true;
        return false;
    }

    public void setName(String name) {
        this.sourceName = name;
    }

    public void setType(String type) {
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

    public String getType() {
        return type;
    }
}
