package org.nerdcore.nodecampaign.repository;

import org.nerdcore.nodecampaign.models.GameNodeNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<GameNodeNote, Integer> {

    List<GameNodeNote> findAllByGameNodeID(int gameNodeID);
}
