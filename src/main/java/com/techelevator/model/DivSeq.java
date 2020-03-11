package com.techelevator.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DivSeq {

	private BigInteger[] seeds = new BigInteger[2];
	private BigInteger seqNumber;
	private List<BigInteger> seq;

	public DivSeq(int seedOne, int seedTwo, int div) {
		this.seeds[0] = BigInteger.valueOf(seedOne);
		this.seeds[1] = BigInteger.valueOf(seedTwo);
		this.seqNumber = BigInteger.valueOf(div);
		this.seq = makeSeq();
	}

	public List<BigInteger> makeSeq() {
		List<BigInteger> seq = new ArrayList<BigInteger>();
		if (this.seqNumber.equals(BigInteger.ONE)) {
			seq.add(BigInteger.ZERO);
			return seq;
		} 
		boolean done = false;
		seq.add(seeds[0].mod(seqNumber));
		seq.add(seeds[1].mod(seqNumber));
		BigInteger fOne = seeds[0];
		// System.out.println(fOne);
		BigInteger fTwo = seeds[1];
		// System.out.println(fTwo);
		BigInteger fThree = seeds[0].add(seeds[1]);
		while (!done) {
			// adds the new number to the sequence
			// System.out.println(fThree);
			seq.add(fThree.mod(seqNumber));
			fOne = fTwo;
			fTwo = fThree;
			fThree = fOne.add(fTwo);
			// checks if we found the end of the sequence
			// System.out.println(seq.subList(0, (seq.size()/2)) + " AND " +
			// seq.subList((seq.size()/2), (seq.size())));
			if (seq.size() % 2 == 0) {
				if (seq.subList(0, (seq.size() / 2)).equals(seq.subList((seq.size() / 2), (seq.size())))) {
					seq = seq.subList(0, seq.size() / 2);
					break;
				}
			}
			if (seq.size() > 2000000) {
				System.out.println("unattainable");
				break;
			}
			// System.out.println(seq.size());
		}
		return seq;
	}
	
	public List<BigInteger> getSeq(){
		return this.seq;
	}
	
	public BigInteger getSeqNum() {
		return this.seqNumber;
	}
	
	public int getSize() {
		return seq.size();
	}
	
	public BigInteger[] getSeeds() {
		return this.seeds;
	}
	
	@Override
	public String toString() {
		String printValue = "Sequence " + this.seqNumber + ": [";
		
		for(BigInteger num : this.seq) {
			printValue += num.toString();
			printValue += ", ";
		}
		printValue = printValue.substring(0, printValue.length()-2);
		printValue += "]";
		
		return printValue;
	}

}

