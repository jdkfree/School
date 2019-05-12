
/*Justin Freemantle and Ananya Vishwanath
 * April 21st
 * Ms Krasteva ICS4U
 * Creates a student object, creates a locker and jacket and assigns them to the student
 */

public class Student {
 String number;
 String name;
 Locker myLocker;
 Jacket myJacket;
 Book [] books;
 
 public Student (String name) {
  this.name = name; 
  this.number = String.valueOf((int)Math.random()*Integer.MAX_VALUE);
  this.myLocker = new Locker (this); //creates books too
  this.myJacket = new Jacket (this);   
 }
 
 public void sentToOffice (String reason) {
  System.out.println("The student was sent to the office because: " + reason);
 }
 
 public String toString () { 
  return (this.name);
 }
}
