package org.nerdcore.nodecampaign;

import org.nerdcore.nodecampaign.models.*;
import org.nerdcore.nodecampaign.repository.ConnectorRepository;
import org.nerdcore.nodecampaign.repository.GameNodeRepository;
import org.nerdcore.nodecampaign.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Controller
public class NodecampaignController {

    @Autowired
    GameNodeRepository gameNodeRepository;

    @Autowired
    ConnectorRepository connectorRepository;

    @Autowired
    NoteRepository noteRepository;

    //private PhylactoryDatabaseManager dbm;

    @RequestMapping("/")
    public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView mv = new ModelAndView("index");


        return mv;

    }

    @RequestMapping("/add")
    public ModelAndView addNodePage(HttpServletResponse response, HttpServletRequest request) {

        ModelAndView mv = new ModelAndView("addnode");

        return mv;
    }

    @GetMapping("/nodes")
    public ModelAndView getAllNodes() {

        ModelAndView mv = new ModelAndView("viewnodes");

        mv.addObject("nodeList", gameNodeRepository.findAll());

        return mv;

    }

    @GetMapping("/add-node")
    public ModelAndView addNodePage() {
        ModelAndView mv = new ModelAndView("addnode");

        List<String> nodeNoteList = new ArrayList<>();
        List<Integer> connectedNodeList = new ArrayList<>();

        //mv.addObject("quillSubmission", new QuillSubmission());
        //mv.addObject("newNoteList", nodeNoteList);
        mv.addObject("newNode", new GameNode());
        mv.addObject("currentNodes", gameNodeRepository.findAll());
        mv.addObject("connectedNodeList", connectedNodeList);
        //mv.addObject("nodeAndNotes", new NodeAndNotes());
        return mv;
    }


    @PostMapping("/add-node")
    public ModelAndView createNode(@ModelAttribute("newNode") GameNode n) {

        gameNodeRepository.save(n);

        return new ModelAndView("index");
    }

    @GetMapping("/display-node")
    public ModelAndView getNodeByID(@RequestParam(value = "id") int nodeID) {
        ModelAndView mv = new ModelAndView("displaynode");
        //gameNodeRepository.findById(nodeID).orElseThrow(() -> new EntityNotFoundException());
        mv.addObject("node",gameNodeRepository.findById(nodeID).orElseThrow(() -> new EntityNotFoundException()));
        mv.addObject("notes", noteRepository.findAllByGameNodeID(nodeID));
        return mv;
    }
}
