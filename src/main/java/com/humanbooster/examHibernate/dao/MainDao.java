package com.humanbooster.examHibernate.dao;

import com.humanbooster.examHibernate.model.Car;

import java.util.List;

public interface MainDao {

    List listAllBrands();
    Integer countAllVehicles();
    List listColorsWithCars();
    List<Car> lastTenVehicles();

}
