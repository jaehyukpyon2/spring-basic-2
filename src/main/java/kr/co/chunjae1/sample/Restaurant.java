package kr.co.chunjae1.sample;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Restaurant {
	
	@Autowired
	private Chef chef;
	
	@Override
	public String toString() {
		return "Restaurant";
	}
}
