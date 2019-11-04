package election;

/** Creates a Candidate object.
 *
 * @author Douglas Luman
 */
public class Candidate {
  
  private int votes = 0;
  public final String name;
  
  /** Constructor.
   *
   * @param name Candidate's name
   */
  public Candidate(String name) {
    this.name = name;
  }
  
  /** Adds votes for a candidate.
   *
   */
  public void addVote() {
    this.votes++;
  }
  
  /** Retrieves running vote total for candidate object.
   *
   */
  public int getVotes() {
    return this.votes;
  }
  
  /** Creates string representation of object.
   *
   */
  public String toString() {
    return this.name + ": " + this.votes;
  }
}