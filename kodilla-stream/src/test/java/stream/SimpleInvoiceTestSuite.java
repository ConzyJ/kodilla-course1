package stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInvoiceTestSuite {

    @Test
    void testGetValueWithConditionalBreakpoint() {
        // Given
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0); // <- Tutaj breakpoint
        SimpleItem item1 = new SimpleItem(product1, 2);
        SimpleItem item2 = new SimpleItem(product2, 3);

        SimpleInvoice invoice = new SimpleInvoice();
        invoice.addItem(item1);
        invoice.addItem(item2);

        // When
        double totalValue = invoice.getTotalValue();

        // Then
        assertEquals(80.0, totalValue); // 2x10 + 3x20 = 80
    }
}
