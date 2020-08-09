package Core_Java_Volume_1.chapter_9.treeSet;

import javax.print.attribute.standard.MediaSize;
import java.util.Comparator;
import java.util.Objects;

/**
 * @ClassName Item
 * @Description
 * @Author yang
 * @Date 2020/8/9 16:30
 * @Version 1.0
 */
public class Item implements Comparable<Item> {

    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return partNumber == item.partNumber &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item item) {
        int diff = Integer.compare(partNumber, item.partNumber);
        return diff != 0 ? diff : description.compareTo(item.description);
    }
}
