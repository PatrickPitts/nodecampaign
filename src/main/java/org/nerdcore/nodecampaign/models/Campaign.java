package org.nerdcore.nodecampaign.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "campaigns")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaignID")
    private long campaignID;

    @Column(name = "campaignName")
    private String campaignName;

    @OneToMany(mappedBy = "campaign")
    @JoinColumn(name = "nodeID")
    private Set<GameNode> gameNodes;

    @ManyToOne
    @JoinColumn(name = "userName")
    private String gmUser;

    @ManyToOne
    @JoinColumn(name = "userName")
    private Set<String> playerUsers;


}
