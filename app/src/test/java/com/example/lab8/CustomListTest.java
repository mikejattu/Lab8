package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     * list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    /**
     * add city to the city to the city list
     * check if the city is in city list using hasCity()
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    /**
     * add city to the city to the city list
     * check if the city is in city list using hasCity()
     * delete that city
     * check if the city is in city list using hasCity()
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
       list.deleteCity(city);
       assertFalse(list.hasCity(city));
    }
    /**
     * add city to the city to the city list
     * check if the city is in city list using hasCity()
     * delete that city
     * check if the city is in city list using hasCity()
     */
    @Test
    public void countCityTest(){
        list = MockCityList();
        City city1 = new City("Estevan", "SK");
        City city2 = new City("Edmonton", "AB");
        list.addCity(city1);
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(list.countCity(city1),2);
    }


}
