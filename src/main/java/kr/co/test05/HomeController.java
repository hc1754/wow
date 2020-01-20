package kr.co.test05;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test05.member.service.MemberService;
import kr.co.test05.member.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@Inject
//	JavaMailSender mailSender;
	private MemberService memberService;

	@RequestMapping(value = "joinForm.do", method = RequestMethod.POST)
	public String memberJoin(MemberVO vo, HttpServletResponse response_alert) throws IOException {
		memberService.insertMember(vo);

		response_alert.setContentType("text/html; charset=UTF-8");
		PrintWriter out_email = response_alert.getWriter();
		out_email.println("<script>alert('회원가입에 성공했습니다.');</script>");
		out_email.flush();

		return "joinForm.do";
	}

//	@RequestMapping(value = "e_mailForm.do", method = RequestMethod.POST)
//	public void main_mailSending(HttpServletRequest request, String sender_front, String sender_back,
//			String recipient_front, String recipient_back, String title, String text,
//			HttpServletResponse response_email) throws IOException {
//
//		int ranNum[] = new int[6];
//		for (int i = 0; i < ranNum.length; i++) {
//			ranNum[i] = (int) (Math.random() * 9);
//			for (int j = 0; j < i; j++) {
//				if (ranNum[i] == ranNum[j]) {
//					j--;
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < ranNum.length; i++) { // 난수 6자리
//		}
//		String str = Arrays.toString(ranNum).replaceAll("[^0-9]", ""); // 배열을 문자형으로 변환
//		System.out.println(str); // 인증번호
//
//		String setfrom = "koncmii@gmail.com"; // 보내는 사람 이메일
//		String tomail = request.getParameter("recipient_front") + request.getParameter("recipient_back"); // 받는 사람 이메일
//		String mail_title = "회원가입 인증 이메일입니다."; // 제목
//		String content = System.getProperty("line.separator") + " 인증번호는 : " + str + " 입니다. "
//				+ System.getProperty("line.separator"); // 이메일 내용
//
//		System.out.println(setfrom); // 값이 잘 담겼는지 테스트
//		System.out.println(content);
//
//		try {
//			MimeMessage message = mailSender.createMimeMessage();
//			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
//
//			messageHelper.setFrom(setfrom); // 보내는사람 / 일단 내 이메일
//			messageHelper.setTo(tomail); // 받는사람 이메일
//			messageHelper.setSubject(mail_title); // 제목
//			messageHelper.setText(content); // 메일 내용 : 인증번호
//
//			mailSender.send(message);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		// 이메일이 발송될때 자바스크립트로 발송되었다고 출력시킴
//		response_email.setContentType("text/html; charset=UTF-8");
//		PrintWriter out_email = response_email.getWriter();
//		out_email.println("<script>alert('이메일이 발송되었습니다.');</script>");
//		out_email.flush();
//
//	}

}
