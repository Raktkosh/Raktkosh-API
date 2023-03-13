package com.raktkosh.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bd_camp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BDCamp extends BaseEntity {

	private String name;
	@Column(name = "date", nullable = false)
	private LocalDate campDate;
   
	@Column(name = "user_id")
	private Long userId;
//@Column(name="city",nullable = false)
//private String city;
//@Column(name="locality",nullable = false)
//private String locality;
//@Column(name="district",nullable = false)
//private String district;
//@Column(name="pin",nullable = false)
//private String zipcode;
	@Column(name = "startTime", nullable = false)
	private String startTime;
	@Column(name = "endTime", nullable = false)
	private String endTime;

//@OneToMany(mappedBy = "camp",cascade = CascadeType.ALL) //mandatory : o.w mapping exc
//private List<CampRegistration> users=new ArrayList<>();
}
