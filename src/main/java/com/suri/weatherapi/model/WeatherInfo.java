package com.suri.weatherapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.suri.weatherapi.dto.CurrentWeather;

@Document(collection = "WeatherInfo")
public class WeatherInfo {
	@Id
	String id;
	String city;
	
	int latitude;
	int longitude;
	String timezone;
	int elevation;
	CurrentWeather current_weather;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public int getElevation() {
		return elevation;
	}
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	public CurrentWeather getCurrent_weather() {
		return current_weather;
	}
	public void setCurrent_weather(CurrentWeather current_weather) {
		this.current_weather = current_weather;
	}
}
