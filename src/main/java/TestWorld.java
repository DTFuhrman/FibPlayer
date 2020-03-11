import com.techelevator.model.DivSeq;
import com.techelevator.model.EightSeq;
import com.techelevator.model.NoteSeq;

public class TestWorld {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
		DivSeq firstAttempt = new DivSeq(1,1,i);
		EightSeq eight = new EightSeq(firstAttempt);
		NoteSeq notes = new NoteSeq(eight, "C");


		System.out.println("Sequence # " + i + " is length: " + firstAttempt.getSize());
		System.out.println(firstAttempt.toString());
		System.out.println(notes.toString() + "\n\n");
		
		}
	}

}
