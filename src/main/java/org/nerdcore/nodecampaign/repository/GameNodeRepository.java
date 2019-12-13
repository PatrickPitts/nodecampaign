package org.nerdcore.nodecampaign.repository;

import org.nerdcore.nodecampaign.models.GameNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameNodeRepository extends CrudRepository<GameNode, Integer> {

    List<GameNode> findByNodeType(String nodeType);

    GameNode findByNodeID(int nodeID);

    List<GameNode> findAll();

}
