
/*Justin Freemantle and Ananya Vishwanath
 * April 21st
 * Ms Krasteva ICS4U
 * Creates a Classroom object, determines whether a student can enter the classroom or not
 */
public class ClassRoom {
 String course; 
 String teacher; 
 
 public ClassRoom (String course, String teacher) {
  this.course = course; 
  this.teacher = teacher;
 }
 
 public boolean enter (Student me) {
  boolean canEnter = true;
  
  System.out.println("Student: " + me.toString() + ", Teacher: " + teacher + ", Course: " + course);
  
  
  if (me.myLocker == null) {
   me.sentToOffice("Student has no locker.");
   canEnter = false;
  }
   
  
  if (me.myJacket != null && me.myLocker.checkJacket () == null) {
   me.sentToOffice("Student has their Jacket.");
   canEnter = false;
  }
  
  
  if (me.myLocker.getABook(course) == null) {
   me.sentToOffice("Student does not have the right book.");
   canEnter = false;
  }
   
  return canEnter;
  }
}
