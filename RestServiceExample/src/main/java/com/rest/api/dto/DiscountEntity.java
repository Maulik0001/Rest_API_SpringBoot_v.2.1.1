/*
 * @author: Maulik Patel
 */

package com.rest.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount_tbl")
public class DiscountEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_type", length=100)
	private String userType;

	@Column(name = "start")
	private Double start;
	
	@Column(name = "end")
	private Double end;

	@Column(name = "discount_perc")
	private Double discountPerc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Double getStart() {
		return start;
	}

	public void setStart(Double start) {
		this.start = start;
	}

	public Double getEnd() {
		return end;
	}

	public void setEnd(Double end) {
		this.end = end;
	}

	public Double getDiscountPerc() {
		return discountPerc;
	}

	public void setDiscountPerc(Double discountPerc) {
		this.discountPerc = discountPerc;
	}
	
}