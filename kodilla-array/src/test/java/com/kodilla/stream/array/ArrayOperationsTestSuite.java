package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // Given
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        // When
        double average = ArrayOperations.getAverage(numbers);

        // Then
        assertEquals(52.5, average, 0.01);
    }
}
