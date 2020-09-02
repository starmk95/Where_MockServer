package com.where.mockserver.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Getter
public class Group {

    private static int mGroupCnt;
    private final User mManager;
    private ArrayList<User> mUserList;
    private int mUserCnt;
    private final int mGroupid;
    private final String inviteLink;

    public Group(User manager) {
        this.mManager = manager;
        this.mUserList = new ArrayList<>();
        mUserList.add(this.mManager);
        this.mUserCnt = 1;
        mGroupCnt += 1;
        this.mGroupid = mGroupCnt;
        this.inviteLink = "가상의 초대링크";
    }

    public void addUser(User newUser) {
        mUserList.add(newUser);
        mUserCnt+=1;
    }

}
