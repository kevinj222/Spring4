package com.UST.Interviewfeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class interviewfeedback
{
    public interviewfeedback(Long id, String userid, String candidateName, String position, String interviewName, String interviewerEmpid, int rating, String status)
    {
        this.id = id;
        this.userid = userid;
        CandidateName = candidateName;
        this.position = position;
        InterviewName = interviewName;
        InterviewerEmpid = interviewerEmpid;
        this.rating = rating;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userid;

    private String CandidateName;
    private String position;
    private String InterviewName;
    private String InterviewerEmpid;

    private int rating;
    private String status;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInterviewName() {
        return InterviewName;
    }

    public void setInterviewName(String interviewName) {
        InterviewName = interviewName;
    }

    public String getInterviewerEmpid() {
        return InterviewerEmpid;
    }

    public void setInterviewerEmpid(String interviewerEmpid) {
        InterviewerEmpid = interviewerEmpid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public interviewfeedback()
    {

    }
}
