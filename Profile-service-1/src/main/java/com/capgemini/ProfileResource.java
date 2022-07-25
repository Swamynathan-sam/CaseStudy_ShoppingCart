package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileResource {
	@Autowired
	ProfileServiceImpl profileServiceImpl;
	
	@PostMapping("/createCustomer")
	public void addNewCustomerProfile(@RequestBody UserProfile userProfile) {
		profileServiceImpl.addNewCustomerProfile(userProfile);
		
	}
	@PostMapping("/createMerchant")
	public UserProfile addNewMerchantProfile(@RequestBody UserProfile userProfile) {
		return profileServiceImpl.addNewMerchantProfile(userProfile);
		
	}
	@PostMapping("/createDeliveryPerson")
	public UserProfile addNewDeliveryProfile(@RequestBody UserProfile userProfile) {
		return profileServiceImpl.addNewDeliveryProfile(userProfile);
		
	}
	//Working
	@GetMapping("/profiles")
	public List<UserProfile> getAllProfiles(){
		return profileServiceImpl.getAllProfiles();
		
	}
	@GetMapping("/profiles/{ProfileId}")
	public UserProfile getByProfileId(@PathVariable("ProfileId") int ProfileId) {
		
		return profileServiceImpl.getByProfileId(ProfileId);
	}
	@PutMapping("/profile/{profileId}")
	public void updateProfile(@RequestBody UserProfile userProfile,@PathVariable Integer profileId) {
		UserProfile existProfile = profileServiceImpl.getByProfileId(profileId);
		profileServiceImpl.addNewCustomerProfile(userProfile);
	}
	@DeleteMapping("/profiles/{profileId}")
	public void deleteProfile(@PathVariable("profileId") int ProfileId) {
		profileServiceImpl.deleteProfile(ProfileId);
	}
	@GetMapping("/profile/contact/{mobileNo}")
	public UserProfile findByMobileNo(Long mobileNo) {
		return profileServiceImpl.findByMobileNo(mobileNo);
		
	}
	@GetMapping("/profile/name/{fullName}")
	public UserProfile getByUserName(@PathVariable("fullName") String fullName) {
		return profileServiceImpl.getByUserName(fullName);
		
	}
}
