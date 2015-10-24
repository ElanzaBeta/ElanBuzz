package com.elanzabeta.elanbuzz.interfacer;

import java.io.UnsupportedEncodingException;

/**
 * Created by Vikhyat on 10/24/2015.
 */
public interface Manager {

    public String getUsername();
    public String sendMessage(String Username, String toUsername, String message) throws UnsupportedEncodingException;
    public void messageReceived(String username, String message);

    public boolean isNetworkConnected();
    public boolean isUserAuthenticated();
    public String getLastRawFriendList();
    public void exit();
    public String signUpUSer(String usernameText, String passwordText, String email);
    public String addNewFriendRequest(String friendUsername);
    public String sendFriendsReqsResponse(String approvedFriendNames, String discardedFriendNames);


}
