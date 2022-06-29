package com.collection.assignment1;

class Contact {
	private Long phone_number;
	private String name;
	private String email;
	private Gender gender;

	public Contact(Long phone_number, String name, String email, Gender gender) {
		this.phone_number = phone_number;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "name: " + name + " Phone no: " + phone_number + " email: " + email;
	}
}
