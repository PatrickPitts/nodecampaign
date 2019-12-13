package org.nerdcore.nodecampaign.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "nodes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class GameNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nodeID;

    @NotBlank
    @Column(length = 128, name = "nodeName")
    private String nodeName = "(No Name)";

    @NotBlank
    @Column(length = 64, name = "nodeType")
    private String nodeType = "(No Type)";

    @Lob
    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "campaignID")
    private Campaign campaign;


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private String nodeImageName;

    public GameNode() {
    }

    public GameNode(String nodeName, String nodeType) {
        this.nodeName = nodeName;
        this.nodeType = nodeType;
    }

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeImageName() {
        return nodeImageName;
    }

    public void setNodeImageName(String nodeImageName) {
        this.nodeImageName = nodeImageName;
    }

    public String toString() {
        return "Name: " + this.nodeName + "  Type: " + this.nodeType + "\n\n"
                + this.notes;
    }
}
