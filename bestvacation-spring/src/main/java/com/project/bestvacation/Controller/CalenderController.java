package com.project.bestvacation.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.project.bestvacation.entity.Calender;
import com.project.bestvacation.repository.CalenderRepository;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/v1") // version1의 API
public class CalenderController {

	private final CalenderRepository calenderRepository;
	
	/**
	 * 멤버 조회
	 * @return
	 */
	@GetMapping("calender")
	public List<Calender> findAllCalender() {
		return calenderRepository.findAll();
	}
	
	/**
	 * 회원가입
	 * @return
	 */
//	@PostMapping("member")
//	public MemberEntity signUp() {
//		final MemberEntity member = MemberEntity.builder()
//				.username("test_user@gmail.com")
//				.name("test user")
//				.build();
//		return memberRepository.save(member);
//	}
}

