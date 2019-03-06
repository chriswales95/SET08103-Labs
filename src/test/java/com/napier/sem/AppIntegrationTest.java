package com.napier.sem;

import com.napier.sem.App;
import com.napier.sem.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("db");
    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee(255530);
        Assertions.assertEquals(emp.emp_no, 255530);
        Assertions.assertEquals(emp.first_name, "Ronghao");
        Assertions.assertEquals(emp.last_name, "Garigliano");
    }
}