package election;

import java.util.ArrayList;

/** Creates a ballot object to hold all valid Candidates.
 *
 * @author Douglas Luman
 */
public class Ballot {
  
  private ArrayList<Candidate> form;

  /** Constructor.
   *
   */
  public Ballot() {
    form = new ArrayList<Candidate>();
  }
  
  /** Adds a candidate to the ballot, if not already there.
   *
   * @param candidate Candidate object to add
   */
  public void addCandidate(Candidate candidate) {
    Candidate searchResult = searchCandidates(candidate.name);
    if (searchResult == null) {
      this.form.add(candidate);
    }
  }
  
  /** Retrieves candidate objects by name.
   *
   * @param name Candidate name
   */
  public Candidate getCandidate(String name) {
    Candidate searchResult = searchCandidates(name);
    if (searchResult != null) {
      return searchResult;
    }
    return null;
  }
  
  /** Retrieves the Candidate object of the winner.
  *
  */
  public Candidate getWinner() {
    int index = 0;
    int maxVotes = 0;
    Candidate candidate;
    for (int i = 0; i < this.form.size(); i++) {
      candidate = this.form.get(i);
      if (candidate.getVotes() > maxVotes) {
        index = i;
        maxVotes = candidate.getVotes();
      }
    }
    return this.form.get(index);
  }
  
  /** Fills out a ballot.
   *
   * @param name Candidate name to vote for
   */
  public void castBallot(String name) {
    Candidate candidate = searchCandidates(name);
    if (candidate != null) {
      candidate.addVote();
      int index = this.form.indexOf(candidate);
      this.form.set(index,candidate);
    } else {
      System.out.println("WRITE-IN: " + name);
      candidate = new Candidate(name);
      addCandidate(candidate);
      castBallot(candidate.name);
    }
  }
  
  /** Searches a ballot form by candidate name and retrieves position.
   *
   * @param name Candidate name
   * @return Candidate Returns Candidate object found or null if not found
   */
  private Candidate searchCandidates(String name) {
    Candidate candidate;
    for (int i = 0; i < this.form.size(); i++) {
      candidate = this.form.get(i);
      if (candidate.name.equals(name)) {
        return candidate;
      }
    }
    return null;
  }
  
  /** Prints a complete ballot to the screen.
   *
   */
  public String toString() {
    int index = 0;
    String ballot = "Current ballot for pond representative:" + "\n\n";
    Candidate candidate;
    for (int i = 0; i < this.form.size(); i++) {
      candidate = this.form.get(i);
      ballot += String.format("%-20s%5d",candidate.name,candidate.getVotes());
      if (i != this.form.size()) {
        ballot += "\n";
      }
    }
    return ballot;
  }
}