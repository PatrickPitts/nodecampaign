package org.nerdcore.nodecampaign.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "phylactoryUsers")
public class PhylactoryUser {

    @Id
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="permissionString")
    private String permissions;

    @OneToMany(mappedBy = "gmUser")
    @JoinColumn(name = "campaignID")
    private Set<Campaign> gmCampaigns;

    @OneToMany(mappedBy = "")
    @JoinColumn(name = "campaignID")
    private Set<Campaign> playerCampaigns;


}
