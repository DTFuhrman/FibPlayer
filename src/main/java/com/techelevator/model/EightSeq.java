package com.techelevator.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EightSeq {

	private BigInteger[] seeds = new BigInteger[2];	
	private BigInteger divNumber = BigInteger.valueOf(8);
	private BigInteger seqNumber;
	private List<BigInteger> seq = new ArrayList<BigInteger>();
	
	public EightSeq(DivSeq divSeq) {
		this.seeds[0] = divSeq.getSeeds()[0];
		this.seeds[1] = divSeq.getSeeds()[1];
		this.seqNumber = divSeq.getSeqNum();
		List<BigInteger> oldSeq = new ArrayList<BigInteger>();
		oldSeq.addAll(divSeq.getSeq()); 
		for(BigInteger num : divSeq.getSeq()) {
			this.seq.add(num.mod(BigInteger.valueOf(8)));
		}
	}
	
	public BigInteger[] getSeeds() {
		return this.seeds;
	}
	
	public BigInteger getSeqNum() {
		return this.seqNumber;
	}
	
	public List<BigInteger> getSeq() {
		return this.seq;
	}
}
