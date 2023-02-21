package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperatureTestNormalTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureTestMaxBorderTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestNormalTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestMinBorderTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMaxTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        assertEquals(40,conditioner.getMaxTemperature());
    }

    @Test
    public void setMinTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        assertEquals(10,conditioner.getMinTemperature());
    }

    @Test
    public void setCurrentTemperatureTestOverMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(30);
        conditioner.setCurrentTemperature(60);
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureTestUnderMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(30);
        conditioner.setCurrentTemperature(5);
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void setOnTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        assertTrue(conditioner.isOn());
    }
}
