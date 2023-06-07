package com.suri.weatherapi.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suri.weatherapi.dto.WeatherDto;
import com.suri.weatherapi.model.WeatherInfo;
import com.suri.weatherapi.repo.WeatherInfoRepo;
@CrossOrigin("http://localhost:4200/")
@RestController
public class MainCtrl {
   @Autowired
   WeatherInfoRepo weatherRepo;
@GetMapping("/getWeather")
ResponseEntity<WeatherDto> getWeather(@RequestHeader String latitude,@RequestHeader String longitude)
{
	String apiUrl="https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude+"&current_weather=true&forecast_days=5&timezone=IST";
	RestTemplate restTemplate =new RestTemplate();
	WeatherDto weatherDto = restTemplate.getForObject(apiUrl,WeatherDto.class);
	return new ResponseEntity<WeatherDto>(weatherDto,HttpStatus.OK);
}

@PostMapping("/postWeather")
ResponseEntity<String>postWeather(@RequestBody WeatherInfo weatherInfo)
{
	  if(weatherRepo.insert(weatherInfo)!=null)
	  {
		  return new ResponseEntity<>("Weather Data Inserted",HttpStatus.OK);
	  }
	  else
      return new ResponseEntity<>("Error Occur",HttpStatus.BAD_REQUEST);	
}
	
}
