package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTests {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(GeneralTests.class);
    private static final String CLASS_NAME = "GeneralTests";

    @BeforeAll
    static void beforeAll() {
        LOG.info("Starting " + CLASS_NAME);
    }

    @BeforeEach
    void beforeEach() {
        LOG.info("Set up before each test");
    }

    @AfterEach
    void afterEach() {
        LOG.info("Tear down after each test");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("Ending " + CLASS_NAME);
    }

    @Test
    public void generalTest() {
        LOG.info("Test 1");
        String one = "one";
        assertEquals("one", one, "Should be one");
    }

}
