package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location locationRussia = geoService.byIp("172.0.32.11");
        Location locationUSA = geoService.byIp("96.44.183.149");

        Assertions.assertEquals(Country.RUSSIA, locationRussia.getCountry());
        Assertions.assertEquals(Country.USA, locationUSA.getCountry());
    }
}
