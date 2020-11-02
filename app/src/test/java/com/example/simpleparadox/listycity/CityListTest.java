package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }
    @Test
    void testRemovefirst() {
        CityList cityList_1 = mockCityList();
        CityList cityList_2 = mockCityList();
        cityList_1.add(new City("Regina", "Saskatchewan"));
        
        assertFalse(cityList_1.hasCity(new City("Edmonton", "Alberta")));
    }

}
