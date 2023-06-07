package com.suri.weatherapi.dto;

import java.time.LocalDateTime;
//import java.util.Date;

public class CurrentWeather {
	float temperature;
    float windspeed;
    float winddirection;
    int weathercode;
    int is_day;
    LocalDateTime time;
    
	public CurrentWeather() {
		this.temperature =0;
		this.windspeed = 0;
		this.winddirection =0;
		this.weathercode =0;
		this.is_day =0;
		this.time =null;
	}
	public CurrentWeather(float temperature, float windspeed, float winddirection, int weathercode, int is_day,
			LocalDateTime time) {
		super();
		this.temperature = temperature;
		this.windspeed = windspeed;
		this.winddirection = winddirection;
		this.weathercode = weathercode;
		this.is_day = is_day;
		this.time = time;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(float windspeed) {
		this.windspeed = windspeed;
	}
	public float getWinddirection() {
		return winddirection;
	}
	public void setWinddirection(float winddirection) {
		this.winddirection = winddirection;
	}
	public int getWeathercode() {
		return weathercode;
	}
	public void setWeathercode(int weathercode) {
		this.weathercode = weathercode;
	}
	public int getIs_day() {
		return is_day;
	}
	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CurrentWeather [temperature=" + temperature + ", windspeed=" + windspeed + ", winddirection="
				+ winddirection + ", weathercode=" + weathercode + ", is_day=" + is_day + ", time=" + time + "]";
	}

}
