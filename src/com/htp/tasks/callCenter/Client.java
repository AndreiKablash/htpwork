package com.htp.tasks.callCenter;

import java.io.Serializable;

public class Client implements Serializable {
    private int clientID;
    private int durationOfCall;

    public Client() {
    }

    public Client(int clientID, int durationOfCall) {
        this.clientID = clientID;
        this.durationOfCall = durationOfCall;
    }

    public int getClientID() {
        return clientID;
    }

    public int getDurationOfCall() {
        return durationOfCall;
    }
}
