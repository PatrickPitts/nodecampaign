package org.nerdcore.nodecampaign.repository;

import org.nerdcore.nodecampaign.models.GameNodeConnector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectorRepository extends CrudRepository<GameNodeConnector, Integer> {

    List<GameNodeConnector> findAll();

    List<GameNodeConnector> findBySourceIDOrTargetID(int sourceID, int targetID);
}
