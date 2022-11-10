package com.taiso.board.db;

import java.sql.Timestamp;

public class BoardDTO {

	private int bo_num;			// 게시판 글번호
	private String bo_ncate;	// 게시판 공지 카테고리
	private String bo_qcate;	// 게시판 문의 카테고리
	private String bo_title;	// 게시판 글제목
	private String bo_pass;		// 게시판 비밀번호
	private String bo_content;  // 게시판 내용
	private String bo_file;		// 게시판 첨부파일
	private Timestamp sysdate;  // 등록일자
	private int bo_re_ref_;		// 답변 번호
	private int bo_re_lev_;		// 답변 레벨
	private int bo_re_seq_;		// 답변 순서
	private int bo_readcount_;	// 조회수
	
	
	// getter,setter
	public int getBo_num() {
		return bo_num;
	}
	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}
	public String getBo_ncate() {
		return bo_ncate;
	}
	public void setBo_ncate(String bo_ncate) {
		this.bo_ncate = bo_ncate;
	}
	public String getBo_qcate() {
		return bo_qcate;
	}
	public void setBo_qcate(String bo_qcate) {
		this.bo_qcate = bo_qcate;
	}
	public String getBo_title() {
		return bo_title;
	}
	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}
	public String getBo_pass() {
		return bo_pass;
	}
	public void setBo_pass(String bo_pass) {
		this.bo_pass = bo_pass;
	}
	public String getBo_content() {
		return bo_content;
	}
	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}
	public String getBo_file() {
		return bo_file;
	}
	public void setBo_file(String bo_file) {
		this.bo_file = bo_file;
	}
	public Timestamp getSysdate() {
		return sysdate;
	}
	public void setSysdate(Timestamp sysdate) {
		this.sysdate = sysdate;
	}
	public int getBo_re_ref_() {
		return bo_re_ref_;
	}
	public void setBo_re_ref_(int bo_re_ref_) {
		this.bo_re_ref_ = bo_re_ref_;
	}
	public int getBo_re_lev_() {
		return bo_re_lev_;
	}
	public void setBo_re_lev_(int bo_re_lev_) {
		this.bo_re_lev_ = bo_re_lev_;
	}
	public int getBo_re_seq_() {
		return bo_re_seq_;
	}
	public void setBo_re_seq_(int bo_re_seq_) {
		this.bo_re_seq_ = bo_re_seq_;
	}
	public int getBo_readcount_() {
		return bo_readcount_;
	}
	public void setBo_readcount_(int bo_readcount_) {
		this.bo_readcount_ = bo_readcount_;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "BoardDTO [bo_num=" + bo_num + ", bo_ncate=" + bo_ncate + ", bo_qcate=" + bo_qcate + ", bo_title="
				+ bo_title + ", bo_pass=" + bo_pass + ", bo_content=" + bo_content + ", bo_file=" + bo_file
				+ ", sysdate=" + sysdate + ", bo_re_ref_=" + bo_re_ref_ + ", bo_re_lev_=" + bo_re_lev_ + ", bo_re_seq_="
				+ bo_re_seq_ + ", bo_readcount_=" + bo_readcount_ + "]";
	}
	
	
}
                                                               