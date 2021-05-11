package com.launchacademy.partyplanner.repositories;

import com.launchacademy.partyplanner.models.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends CrudRepository<Friend, Integer> {
}
