package kr.co.chunjae1.sample;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class Chef {
	
	@Override
	public String toString() {
		return "Chef";
	}
}
