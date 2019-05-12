/*Justin Freemantle and Ananya Vishwanath
 * April 21st
 * Ms Krasteva ICS4U
 * Creates a book object
 */

public class Book {
 String title;
 String course; 
 
 public Book() {}
 
 public void setTitle (String thisTitle) {
  this.title = thisTitle;
 }
 
 public void setCourse (String course) {
  this.course = course;
 }
 
 public String toString () {
  return (this.title + " for " + this.course + " class.");
 }
}
