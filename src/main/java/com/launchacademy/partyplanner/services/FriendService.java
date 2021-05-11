package com.launchacademy.partyplanner.services;

import com.launchacademy.partyplanner.models.Friend;
import com.launchacademy.partyplanner.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    private FriendRepository friendRepo;

    @Autowired
    public FriendService(FriendRepository friendRepo) {
        this.friendRepo = friendRepo;
    }

    public List<Friend> findAll() {
        return (List<Friend>) friendRepo.findAll();
    }

    public void add(Friend friend) {
        friendRepo.save(friend);
    }
}
