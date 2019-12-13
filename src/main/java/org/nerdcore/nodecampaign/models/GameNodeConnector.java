package org.nerdcore.nodecampaign.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class GameNodeConnector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int connectorID;

    @NotBlank
    private int sourceID;

    @NotBlank
    private int targetID;

    private String connectionType;

    public GameNodeConnector(){}

    public GameNodeConnector(@NotBlank int sourceID, @NotBlank int targetID, String connectionType) {
        this.sourceID = sourceID;
        this.targetID = targetID;
        this.connectionType = connectionType;
    }

    public int getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(int connectorID) {
        this.connectorID = connectorID;
    }

    public int getSourceID() {
        return sourceID;
    }

    public void setSourceID(int sourceID) {
        this.sourceID = sourceID;
    }

    public int getTargetID() {
        return targetID;
    }

    public void setTargetID(int targetID) {
        this.targetID = targetID;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String toString(){
        return "SourceID: "+this.sourceID+"  TargetID: "+this.targetID;
    }

}
