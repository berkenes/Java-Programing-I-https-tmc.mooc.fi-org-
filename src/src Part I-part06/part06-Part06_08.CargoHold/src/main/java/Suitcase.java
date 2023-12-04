import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxTotalWeight;

    public Suitcase(int maxTotalWeight) {
        this.items = new ArrayList<>();
        this.maxTotalWeight = maxTotalWeight;
    }

    public int totalWeight() {
        int weight = 0;
        for (Item w : items) {
            weight += w.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxTotalWeight) {
            this.items.add(item);
        } else {
            return;
        }

    }

    public void printItems() {
        for (Item printItem : items) {
            System.out.println(printItem);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }

        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        String itemWeight = " (" + totalWeight() + " kg)";
        String itemOutput = "";
        if (items.isEmpty()) {
            itemOutput = "no items";
        }
        else if (items.size() == 1){
            itemOutput = "1 item";
        }
        else {
            itemOutput= this.items.size() + " items";
        }
        return itemOutput + itemWeight;
    }
}
