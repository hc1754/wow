package kr.co.test05.member.vo;

public class MemberVO {

	private String mem_email;
	private String mem_pass;
	private String mem_authId;
	private String mem_hp;

	@Override
	public String toString() {
		return "MemberVO [mem_email=" + mem_email + ", mem_pass=" + mem_pass + ", mem_authId=" + mem_authId
				+ ", mem_hp=" + mem_hp + "]";
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_pass() {
		return mem_pass;
	}

	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}

	public String getMem_authId() {
		return mem_authId;
	}

	public void setMem_authId(String mem_authId) {
		this.mem_authId = mem_authId;
	}

	public String getMem_hp() {
		return mem_hp;
	}

	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}

}
