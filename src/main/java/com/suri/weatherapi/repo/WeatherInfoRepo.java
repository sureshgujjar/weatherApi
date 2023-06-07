package com.suri.weatherapi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.suri.weatherapi.model.WeatherInfo;

public interface WeatherInfoRepo extends MongoRepository<WeatherInfo, String>{

}
