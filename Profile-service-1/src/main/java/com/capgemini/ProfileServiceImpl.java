package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfileServiceImpl {

	@Autowired
	private ProfileRepository profileRepository;
	
	
	public void addNewCustomerProfile(UserProfile userProfile) 
	{
		profileRepository.save(userProfile);
	}

	
	public UserProfile addNewMerchantProfile(UserProfile userProfile) 
	{
		return profileRepository.save(userProfile);
	}

	public UserProfile addNewDeliveryProfile(UserProfile userProfile) 
	{
		return profileRepository.save(userProfile);
	}

	public List<UserProfile> getAllProfiles() 
	{
		List<UserProfile> users= new ArrayList<>();
		profileRepository.findAll().forEach(users::add);
		return users;
	}

	public UserProfile getByProfileId(int ProfileId) 
	{
		 return profileRepository.findById(ProfileId).get();
	}

	/*
	 * @Override public void updateProfile(int profileId ,UserProfile userProfile) {
	 * profileRepository.getById(profileId).
	 * 
	 * }
	 */

	public void deleteProfile(int ProfileId) 
	{
		profileRepository.deleteById(ProfileId);
		
	}

	public UserProfile findByMobileNo(Long mobileNo) 
	{
		return profileRepository.findAllByMobileNumber(mobileNo);
	}

	public UserProfile getByUserName(String fullName) 
	{
		UserProfile findByname=profileRepository.findByfullName(fullName);
		return findByname;
	}

}
