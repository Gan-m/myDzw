package com.accp.pojo;

import java.util.Date;


public class Viplist {
    private Integer id;

    private Integer mid;

    private String clientno;

    private Float integral;

    private Date jiontime;

    private Float sumjf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }

    public Date getJiontime() {
        return jiontime;
    }

    public void setJiontime(Date jiontime) {
        this.jiontime = jiontime;
    }

    public Float getSumjf() {
        return sumjf;
    }

    public void setSumjf(Float sumjf) {
        this.sumjf = sumjf;
    }

	public Viplist(Integer id, Integer mid, String clientno, Float integral, Date jiontime, Float sumjf) {
		super();
		this.id = id;
		this.mid = mid;
		this.clientno = clientno;
		this.integral = integral;
		this.jiontime = jiontime;
		this.sumjf = sumjf;
	}

	public Viplist() {
		super();
	}

	@Override
	public String toString() {
		return "Viplist [id=" + id + ", mid=" + mid + ", clientno=" + clientno + ", integral=" + integral
				+ ", jiontime=" + jiontime + ", sumjf=" + sumjf + "]";
	}
    
}