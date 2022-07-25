package com.capgemini;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<UserProfile, Integer>
{
	public UserProfile findAllByMobileNumber(Long mobileNumber);
	public UserProfile findByfullName(String fullName);
}
//extends CrudRepository<UserProfile, Integer>