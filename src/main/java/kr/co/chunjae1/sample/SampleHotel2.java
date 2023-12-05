package kr.co.chunjae1.sample;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.tags.form.CheckboxesTag;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@RequiredArgsConstructor
@Component
public class SampleHotel2 {

	@NonNull
	public Chef chef;
}
