package com.techelevator.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class HatToNoteConverter {

	private static final Map<String, Integer> KEY_OCTIVES = new HashMap<String, Integer>(){{
		put("C", 7);
		put("B#", 7);
		put("G", 3);
		put("D", 6);
		put("A", 2);
		put("E", 5);
		put("Fb", 5);
		put("B", 1);
		put("Cb", 7);
		put("F#", 4);
		put("Gb", 4);
		put("C#", 7);
		put("Db", 7);
		put("Ab", 2);
		put("G#", 2);
		put("Eb", 5);
		put("D#", 5);
		put("Bb", 1);
		put("A#", 1);
		put("F", 4);
		put("E#", 4);
		put("Am", 2);
		put("Em", 5);
		put("Fbm", 5);
		put("Bm", 1);
		put("Cbm", 1);
		put("F#m", 4);
		put("Gbm", 4);
		put("C#m", 7);
		put("Dbm", 7);
		put("G#m", 3);
		put("Abm", 3);
		put("D#m", 6);
		put("Ebm", 6);
		put("A#m", 1);
		put("Bbm", 1);
		put("Fm", 4);
		put("E#m", 4);
		put("Cm", 7);
		put("B#m", 7);
		put("Gm", 3);
		put("Dm", 6);
	}};
	
	private static final Map<String, String[]> KEY_TO_NOTE_MAP = new HashMap<String, String[]>(){{
		put("C", 	new String[] {"C", "D", "E", "F", "G", "A", "B", "C"});
		put("B#", 	new String[] {"C", "D", "E", "F", "G", "A", "B", "C"});
		put("G", 	new String[] {"G", "A", "B", "C", "D", "E", "F#", "G"});
		put("D", 	new String[] {"D", "E", "F#", "G", "A", "B", "C#", "D"});
		put("A", 	new String[] {"A", "B", "C#", "D", "E", "F#", "G#", "A"});
		put("E", 	new String[] {"E", "F#", "G#", "A", "B", "C#", "D#", "E"});
		put("Fb", 	new String[] {"E", "F#", "G#", "A", "B", "C#", "D#", "E"});
		put("B", 	new String[] {"B", "C#", "D#", "E", "F#", "G#", "A#", "B"});
		put("Cb", 	new String[] {"B", "C#", "D#", "E", "F#", "G#", "A#", "B"});
		put("F#", 	new String[] {"F#", "G#", "A#", "B", "C#", "D#", "F", "F#"});
		put("Gb", 	new String[] {"F#", "G#", "A#", "B", "C#", "D#", "F", "F#"});
		put("C#", 	new String[] {"C#", "D#", "F", "F#", "G#", "A#", "C", "C#"});
		put("Db", 	new String[] {"C#", "D#", "F", "F#", "G#", "A#", "C", "C#"});
		put("Ab", 	new String[] {"G#", "A#", "C", "C#", "D#", "F", "G", "G#"});
		put("G#", 	new String[] {"G#", "A#", "C", "C#", "D#", "F", "G", "G#"});
		put("Eb", 	new String[] {"D#", "F", "G", "G#", "A#", "C", "D", "D#"});
		put("D#", 	new String[] {"D#", "F", "G", "G#", "A#", "C", "D", "D#"});
		put("Bb", 	new String[] {"A#", "C", "D", "D#", "F", "G", "A", "A#"});
		put("A#", 	new String[] {"A#", "C", "D", "D#", "F", "G", "A", "A#"});
		put("F", 	new String[] {"F", "G", "A", "A#", "C", "D", "E", "F"});
		put("E#", 	new String[] {"F", "G", "A", "A#", "C", "D", "E", "F"});
		put("Am", 	new String[] {"A", "B", "C", "D", "E", "F", "G", "A"});
		put("Em", 	new String[] {"E", "F#", "G", "A", "B", "C", "D", "E"});
		put("Fbm", 	new String[] {"E", "F#", "G", "A", "B", "C", "D", "E"});
		put("Bm", 	new String[] {"B", "C#", "D", "E", "F#", "G", "A", "B"});
		put("Cbm", 	new String[] {"B", "C#", "D", "E", "F#", "G", "A", "B"});
		put("F#m", 	new String[] {"F#", "G#", "A", "B", "C#", "D", "E", "F#"});
		put("Gbm", 	new String[] {"F#", "G#", "A", "B", "C#", "D", "E", "F#"});
		put("C#m", 	new String[] {"C#", "D#", "E", "F#", "G#", "A", "B", "C#"});
		put("Dbm", 	new String[] {"C#", "D#", "E", "F#", "G#", "A", "B", "C#"});
		put("G#m", 	new String[] {"G#", "A#", "B", "C#", "D#", "E", "F#", "G#"});
		put("Abm", 	new String[] {"G#", "A#", "B", "C#", "D#", "E", "F#", "G#"});
		put("D#m", 	new String[] {"D#", "F", "F#", "G#", "A#", "B", "C#", "D#"});
		put("Ebm", 	new String[] {"D#", "F", "F#", "G#", "A#", "B", "C#", "D#"});
		put("A#m", 	new String[] {"A#", "C", "C#", "D#", "F", "F#", "G#", "A#"});
		put("Bbm", 	new String[] {"A#", "C", "C#", "D#", "F", "F#", "G#", "A#"});
		put("Fm", 	new String[] {"F", "G", "G#", "A#", "C", "C#", "D#", "F"});
		put("E#m", 	new String[] {"F", "G", "G#", "A#", "C", "C#", "D#", "F"});
		put("Cm", 	new String[] {"C", "D", "D#", "F", "G", "G#", "A#", "C"});
		put("B#m", 	new String[] {"C", "D", "D#", "F", "G", "G#", "A#", "C"});
		put("Gm", 	new String[] {"G", "A", "A#", "C", "D", "D#", "F", "G"});
		put("Dm", 	new String[] {"D", "E", "F", "G", "A", "A#", "C", "D"});
	}};
	
	public List<String> convertToNotes(String key, List<BigInteger> numSeq) {
		List<String> noteSeq = new ArrayList<String>();
		BigInteger hat = BigInteger.ZERO;
		for (BigInteger num: numSeq) {
			if(num.equals(BigInteger.ZERO)) {
				hat = BigInteger.valueOf(8);
			} else {
				hat = num;
			}
			noteSeq.add(KEY_TO_NOTE_MAP.get(key)[hat.intValue()-1]);
		}
		noteSeq.add("rest");
		return noteSeq;
	}

}
