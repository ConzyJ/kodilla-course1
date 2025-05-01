package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void testProbablyIWillThrowException_noException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2));
    }

    @Test
    void testProbablyIWillThrowException_withException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }
}
