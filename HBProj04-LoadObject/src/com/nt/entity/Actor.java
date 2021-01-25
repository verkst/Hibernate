package com.nt.entity;

public class Actor {

	private Integer actorId;
	private String actorName;
	private String address;
	private float remuneration;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(float remuneration) {
		this.remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", address=" + address + ", remuneration="
				+ remuneration + "]";
	}

}
