package org.nerdcore.nodecampaign;

import org.nerdcore.nodecampaign.models.GameNode;
import org.nerdcore.nodecampaign.repository.ConnectorRepository;
import org.nerdcore.nodecampaign.repository.GameNodeRepository;
import org.nerdcore.nodecampaign.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhylactoryDatabaseManager {

    @Autowired
    private static GameNodeRepository gameNodeRepository;

    @Autowired
    private static ConnectorRepository connectorRepository;

    @Autowired
    private static NoteRepository noteRepository;

    public static Map<Integer, String> gameNodeIDtoNameMap(){

        Map<Integer, String> gameNodeIDtoNameMap = new HashMap<>();
        for(GameNode g : gameNodeRepository.findAll()){
            gameNodeIDtoNameMap.put(g.getNodeID(), g.getNodeName());
        }

        return gameNodeIDtoNameMap;
    }

    public static List<GameNode> gameNodeList(){
        return gameNodeRepository.findAll();
    }
}
