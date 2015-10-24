package com.elanzabeta.elanbuzz.interfacer;

/**
 * Created by Vikhyat on 10/24/2015.
 */


import com.elanzabeta.elanbuzz.InfoOfMessage;
import com.elanzabeta.elanbuzz.typo.InfoOfFriends;

public interface Updater {

    public void updateData(InfoOfMessage[] message, InfoOfFriends[] friends, InfoOfFriends[] unApprovedFriends, String userKey);
}



