package com.techelevator.model;

import java.math.BigInteger;
import java.util.List;

public class NoteSeq {

	private BigInteger seqNumber;
	private String key;
	private boolean played = false;
	private Integer lastNotePlayed;
	private List<String> seq;
	private HatToNoteConverter hatCon = new HatToNoteConverter();
	
	public NoteSeq(EightSeq eight, String key) {
		this.seqNumber = eight.getSeqNum();
		this.key = key;
		this.seq = hatCon.convertToNotes(key, eight.getSeq());	
	}
	
	@Override
	public String toString() {
		String printValue = "Sequence " + this.seqNumber + ": [";
		
		for(String num : this.seq) {
			printValue += num.toString();
			printValue += ", ";
		}
		printValue = printValue.substring(0, printValue.length()-2);
		printValue += "]";
		
		return printValue;
	}
	
	public List<String> getSeq() {
		return this.seq;
	}
	
}

/*



const scales = [
                { key: "C", notes: ["C", "D", "E", "F", "G", "A", "B"], octAt: 7},
                { key: "B#", notes: ["C", "D", "E", "F", "G", "A", "B"], octAt: 7},
                { key: "G", notes: ["G", "A", "B", "C", "D", "E", "F#"], octAt: 3},
                { key: "D", notes: ["D", "E", "F#", "G", "A", "B", "C#"], octAt: 6},
                { key: "A", notes: ["A", "B", "C#", "D", "E", "F#", "G#"], octAt: 2},
                { key: "E", notes: ["E", "F#", "G#", "A", "B", "C#", "D#"], octAt: 5},
                { key: "Fb", notes: ["E", "F#", "G#", "A", "B", "C#", "D#"], octAt: 5},
                { key: "B", notes: ["B", "C#", "D#", "E", "F#", "G#", "A#"], octAt: 1},
                { key: "Cb", notes: ["B", "C#", "D#", "E", "F#", "G#", "A#"], octAt: 7},
                { key: "F#", notes: ["F#", "G#", "A#", "B", "C#", "D#", "F"], octAt: 4},
                { key: "Gb", notes: ["F#", "G#", "A#", "B", "C#", "D#", "F"], octAt: 4},
                { key: "C#", notes: ["C#", "D#", "F", "F#", "G#", "A#", "C"], octAt: 7},
                { key: "Db", notes: ["C#", "D#", "F", "F#", "G#", "A#", "C"], octAt: 7},
                { key: "Ab", notes: ["G#", "A#", "C", "C#", "D#", "F", "G"], octAt: 2},
                { key: "G#", notes: ["G#", "A#", "C", "C#", "D#", "F", "G"], octAt: 2},
                { key: "Eb", notes: ["D#", "F", "G", "G#", "A#", "C", "D"], octAt: 5},
                { key: "D#", notes: ["D#", "F", "G", "G#", "A#", "C", "D"], octAt: 5},
                { key: "Bb", notes: ["A#", "C", "D", "D#", "F", "G", "A"], octAt: 1},
                { key: "A#", notes: ["A#", "C", "D", "D#", "F", "G", "A"], octAt: 1},
                { key: "F", notes: ["F", "G", "A", "A#", "C", "D", "E"], octAt: 4},
                { key: "E#", notes: ["F", "G", "A", "A#", "C", "D", "E"], octAt: 4},
                { key: "Am", notes: ["A", "B", "C", "D", "E", "F", "G"], octAt: 2},
                { key: "Em", notes: ["E", "F#", "G", "A", "B", "C", "D"], octAt: 5},
                { key: "Fbm", notes: ["E", "F#", "G", "A", "B", "C", "D"], octAt: 5},
                { key: "Bm", notes: ["B", "C#", "D", "E", "F#", "G", "A"], octAt: 1},
                { key: "Cbm", notes: ["B", "C#", "D", "E", "F#", "G", "A"], octAt: 1},
                { key: "F#m", notes: ["F#", "G#", "A", "B", "C#", "D", "E"], octAt: 4},
                { key: "Gbm", notes: ["F#", "G#", "A", "B", "C#", "D", "E"], octAt: 4},
                { key: "C#m", notes: ["C#", "D#", "E", "F#", "G#", "A", "B"], octAt: 7},
                { key: "Dbm", notes: ["C#", "D#", "E", "F#", "G#", "A", "B"], octAt: 7},
                { key: "G#m", notes: ["G#", "A#", "B", "C#", "D#", "E", "F#"], octAt: 3},
                { key: "Abm", notes: ["G#", "A#", "B", "C#", "D#", "E", "F#"], octAt: 3},
                { key: "D#m", notes: ["D#", "F", "F#", "G#", "A#", "B", "C#"], octAt: 6},
                { key: "Ebm", notes: ["D#", "F", "F#", "G#", "A#", "B", "C#"], octAt: 6},
                { key: "A#m", notes: ["A#", "C", "C#", "D#", "F", "F#", "G#"], octAt: 1},
                { key: "Bbm", notes: ["A#", "C", "C#", "D#", "F", "F#", "G#"], octAt: 1},
                { key: "Fm", notes: ["F", "G", "G#", "A#", "C", "C#", "D#"], octAt: 4},
                { key: "E#m", notes: ["F", "G", "G#", "A#", "C", "C#", "D#"], octAt: 4},
                { key: "Cm", notes: ["C", "D", "D#", "F", "G", "G#", "A#"], octAt: 7},
                { key: "B#m", notes: ["C", "D", "D#", "F", "G", "G#", "A#"], octAt: 7},
                { key: "Gm", notes: ["G", "A", "A#", "C", "D", "D#", "F"], octAt: 3},
                { key: "Dm", notes: ["D", "E", "F", "G", "A", "A#", "C"], octAt: 6}
            ];
*/