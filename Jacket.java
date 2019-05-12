
/*Justin Freemantle and Ananya Vishwanath
 * April 21st
 * Ms Krasteva ICS4U
 * Creates a jacket object
 */

public class Jacket {
 
 Student owner;
 
 public Jacket (Student me) {
  owner = me; 
 }

 public String toString () {
  return owner.toString();
 }
}
