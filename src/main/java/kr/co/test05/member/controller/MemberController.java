/*
 * package kr.co.test05.member.controller;
 * 
 * import javax.inject.Inject;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * import kr.co.test05.member.service.MemberService; import
 * kr.co.test05.member.vo.MemberVO;
 * 
 * @Controller
 * 
 * @RequestMapping("/member/*") public class MemberController {
 * 
 * @Inject private MemberService memberService;
 * 
 * @RequestMapping(value = "/joinForm.do", method = RequestMethod.POST) public
 * String memberJoin(MemberVO vo) { memberService.insertMember(vo);
 * 
 * return "home"; }
 * 
 * 
 * }
 */