package com.techelevator.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.DivSeq;
import com.techelevator.model.EightSeq;
import com.techelevator.model.NoteSeq;

@Controller 
public class FibController {

	@RequestMapping(path = {"/", "/playerInput"}, method = RequestMethod.GET)
	public String displayInputForm() {
		
		return "playerInput";
	}
	
	@RequestMapping(path = {"/", "/playerInput"}, method = RequestMethod.POST)
	public String processInput(@RequestParam String seedOne, @RequestParam String seedTwo, @RequestParam String key, HttpSession session, RedirectAttributes flash) {
		BigInteger seedBIOne = BigInteger.valueOf(Integer.parseInt(seedOne));
		BigInteger seedBITwo = BigInteger.valueOf(Integer.parseInt(seedTwo));
		
		BigInteger[] seeds = new BigInteger[] {seedBIOne, seedBITwo};
		session.setAttribute("key", key);
		session.setAttribute("seeds",  seeds);
		return "redirect:/playerOutput";
	}
	
	@RequestMapping(path = {"/playerOutput"}, method = RequestMethod.GET)
	public String displayOutput(HttpSession session) {
		BigInteger[] seeds = (BigInteger[])session.getAttribute("seeds");
		String key = (String)session.getAttribute("key");
		List<DivSeq> numBook = new ArrayList<DivSeq>();
		List<NoteSeq> noteBook = new ArrayList<NoteSeq>();
		
		
		for(int i = 1 ; i <= 45 ; i++) {
			DivSeq tempDivSeq = new DivSeq(seeds[0].intValue(), (Integer)seeds[1].intValue(), i);
			numBook.add(tempDivSeq);
			EightSeq tempEightSeq = new EightSeq(tempDivSeq);
			NoteSeq tempNoteSeq = new NoteSeq(tempEightSeq, key);
			noteBook.add(tempNoteSeq);
		}
		
		session.setAttribute("numBook", numBook);
		session.setAttribute("noteBook", noteBook);
		return "playerOutput";
	}
}
