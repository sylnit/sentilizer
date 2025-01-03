package org.sylnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentilizerTest {

    private Sentilizer sentilizer;

    @BeforeEach
    void setUp(){
        sentilizer = new Sentilizer();
    }

    @Test
    void testPositive() {
        String text = "Simplest codings is the best place to learn and grow. I am glad to be here.";
        String sentiment = sentilizer.analyze(text);
        assertEquals("Positive", sentiment);
    }

    @Test
    void testNegative(){
        String text = "I hate this place. I am not coming back here again. I am very disappointed.";
        String sentiment = sentilizer.analyze(text);
        assertEquals("Negative", sentiment);
    }

    @Test
    void testNeutral(){
        String text = "I have mixed feeling about this";
        String sentiment = sentilizer.analyze(text);
        assertEquals("Neutral", sentiment);
    }
}