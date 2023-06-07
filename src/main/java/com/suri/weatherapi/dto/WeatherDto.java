package com.suri.weatherapi.dto;

public class WeatherDto {
	
      
	  float latitude;
	  float longitude;
	  float generationtime_ms;
	  int utc_offset_seconds;
	  String timezone;
	  String timezone_abbreviation;
	  float elevation;
	  CurrentWeather current_weather;
	  
	public CurrentWeather getCurrent_weather() {
		return current_weather;
	}
	public void setCurrent_weather(CurrentWeather current_weather) {
		this.current_weather = current_weather;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getGenerationtime_ms() {
		return generationtime_ms;
	}
	public void setGenerationtime_ms(float generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}
	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}
	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}
	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}
	public float getElevation() {
		return elevation;
	}
	public void setElevation(float elevation) {
		this.elevation = elevation;
	}
	@Override
	public String toString() {
		return "WeatherInfo [latitude=" + latitude + ", longitude=" + longitude + ", generationtime_ms="
				+ generationtime_ms + ", utc_offset_seconds=" + utc_offset_seconds + ", timezone=" + timezone
				+ ", timezone_abbreviation=" + timezone_abbreviation + ", elevation=" + elevation + ", current_weather="
				+ current_weather + "]";
	}

}
