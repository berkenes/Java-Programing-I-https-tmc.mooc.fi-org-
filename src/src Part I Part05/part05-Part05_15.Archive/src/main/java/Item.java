public class Item {
private String identifier;
private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if (!(compared instanceof Item)){
            return false;
        }
        if(this.identifier.equals(((Item) compared).identifier)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}

