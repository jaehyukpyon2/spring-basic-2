package kr.co.chunjae1.sample;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.tags.form.CheckboxesTag;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@Component
public class SampleHotel {

	public Chef chef;
	
//	생성자 주입
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
}
