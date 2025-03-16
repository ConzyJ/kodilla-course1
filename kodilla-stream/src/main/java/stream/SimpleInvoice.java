package stream;

import java.util.ArrayList;
import java.util.List;

public class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public double getTotalValue() {
        return items.stream()
                .mapToDouble(SimpleItem::getValue)
                .sum();
    }
}
