package com.capgemini;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Profile")
public class UserProfile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profileId")
	private int profileId;
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "image")
	private String image;
	@Column(name = "email")
	private String email;
	@Column(name = "mobileNumber")
	private long mobileNumber;
	@Column(name = "about")
	private String about;
	@Column(name = "dateOfBirth")
	private LocalDate dateOfBirth;
	@Column(name = "gender")
	private String gender;
	@Column(name = "role")
	private String role;
	@Column(name = "password")
	private String password;
	
	public UserProfile(String fullName, String image, String email, long mobileNumber, String about,
			LocalDate dateOfBirth, String gender, String role, String password) {
		this.fullName = fullName;
		this.image = image;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.about = about;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.role = role;
		this.password = password;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserProfile [profileId=" + profileId + ", fullName=" + fullName + ", image=" + image + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", about=" + about + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", role=" + role + ", password=" + password + "]";
	}
	public UserProfile() {
		
	}
	
}
//DROP TABLE IF EXISTS UserProfile;
//CREATE TABLE TEST(profileId INT PRIMARY KEY,
//fullName VARCHAR(255),
//image VARCHAR(255)
//email VARCHAR(60),
//mobileNumber Long,
//about VARCHAR(255),
//dateOfBirth DATE,
//gender VARCHAR(10),
//role VARCHAR(10),
//password VARCHAR(60)
//);