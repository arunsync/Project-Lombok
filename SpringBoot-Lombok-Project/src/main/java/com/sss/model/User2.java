package com.sss.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User2 {
	
	@Getter
	private int id;
	
	@Getter
	@Setter
	String name;
	
	private String email;
}