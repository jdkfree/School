
/*Justin Freemantle and Ananya Vishwanath
 * April 21st
 * Ms Krasteva ICS4U
 * Creates a locker object, creates an array of books to put in the locker.
 */

public class Locker {
 int number;
 Student owner;
 private Jacket studentJacket;
 private Book [] books;
 
 public Locker (Student me) {
  this.owner = me;
  this.number = (int) Math.random()*(Integer.MAX_VALUE);
  studentJacket = new Jacket (this.owner);
  this.books = new Book [4];
  for (int i = 0; i < 4; i ++)
   books[i] = new Book ();
  this.books[0].setTitle ("Intro to Calculus");
  this.books[1].setTitle ("AP Barron's");
  this.books[2].setTitle ("Introduction to Canadian Law");
  this.books[3].setTitle ("Nelson Physics");
  
  this.books[0].setCourse ("Calculus");
  this.books[1].setCourse ("Computer Science");
  this.books[2].setCourse ("Law");
  this.books[3].setCourse ("Physics");
 }
 
 public Book getABook (String course) {
  for (Book i: books)
   if (i.course.equals(course))
    return (i);
  return null; 
 }
 
 public void putABook (Book book) { 
  for (int i = 0; i < 4; i ++) {
   if (books[i] == null) {
    books[i]= book;
    break;
   }
  }
 }
 
 public Jacket getJacket() {
  Jacket temp = new Jacket (studentJacket.owner);
  studentJacket = null;
  return temp; 
 }
 
 public Jacket checkJacket () {
  if (studentJacket.toString().equals(this.owner))
    return studentJacket;
  else
   return null;
 }
 
 public void putJacket (Jacket thisJacket) {
  this.studentJacket = thisJacket;
 }
 
 public void assignOwner (Student owns) {  
  this.owner = owns;
 }
 
 public String toString () {
  return "Number: " + this.number + ", owned by: " + this.owner;
    } 
 
}
