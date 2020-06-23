package org.noticeBoard.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="notice")
public class Notice {
	@Id
	@Column(name="notice_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int noticeId;
	
	@Column(name="teacher_id")
	private int teacherId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date creationDate;
	
	@Column(name="time")
	private Time creationTime;

	
	public Notice() {
		super();
	}
	
	public Notice(int noticeId, int teacherId, String title, String content, Date creationDate,Time creationTime) {
		super();
		this.noticeId = noticeId;
		this.teacherId = teacherId;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
		this.creationTime=creationTime;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Time getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Time creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", teacherId=" + teacherId + ", title=" + title + ", content=" + content
				+ ", creationDate=" + creationDate + ", creationTime=" + creationTime + "]";
	}
	
	
}
