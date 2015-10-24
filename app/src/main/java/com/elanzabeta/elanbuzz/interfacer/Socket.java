package com.elanzabeta.elanbuzz.interfacer;

/**
 * Created by Vikhyat on 10/24/2015.
 */
public interface Socket {

    public String sendHTTPRequest (String Params);
    public int startListeningPort(int Port);

    public void stopListening();
    public void exit();
}
