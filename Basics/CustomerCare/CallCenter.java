/*

This is a Call Center application. There is a group of Customer Support Representatives that assist Customers. 
When representatives become available they enter the queue. 
The acceptCustomer method gets called when a new customer phones in. 
*/


import java.util.ArrayDeque;
import java.util.Queue;

public class CallCenter {
  Queue<CustomerSupportRep> mSupportReps;
  
  public CallCenter(Queue<CustomerSupportRep> queue) {
    mSupportReps = queue;
  }

  public void acceptCustomer(Customer customer) {
    CustomerSupportRep csr;
    /********************************************
     * TODO (1) 
     * Wait until there is an available rep in the queue.
     * While there is not one available, playHoldMusic
     * HINT: That while assignmentcheck loop syntax we used to 
      *      read files seems pretty similar
     ********************************************
     */
      while  (mSupportReps.peek() == null) { 
      playHoldMusic();
    }

    /********************************************
     * TODO (2) 
     * After we have assigned the rep, call the 
     * assist method and pass in the customer
     ********************************************
     */
    csr = mSupportReps.poll();
    csr.assist(customer);
    
    /********************************************
     * TODO (3) 
     * Since the customer support rep is done with
     * assisting, put them back into the queue.
     ********************************************
     */
    mSupportReps.add(csr);
    
  }

  public void playHoldMusic() {
    System.out.println("Smooooooth Operator.....");
  }
 
}