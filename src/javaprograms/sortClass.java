/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
import java.util.*; 
/**
 * <h1>Write code to sort students based on mark.</h1>
 * <p>Display Student name with marks in Ascending order</p>
 * @author Divya
 * @version 1.0
 * @since   2020-07-29
 */ 
public class sortClass{  
 /**
  * @param args the command line arguments
  */
public static void main(String args[]){  
    /**
     * @param Arraylist of student Class
     */
ArrayList<Student> std=new ArrayList<Student>(); 
/**
 * add Student object to the Student ArrayList
 */
std.add(new Student("divya",12.3,20,30,40,50));  
std.add(new Student("palak",11,20,30,40,50));  
std.add(new Student("madhav",12,20,30,40,50));  
std.add(new Student("shivam",12,23,30,40,50));  
std.add(new Student("monica",12,22,30,40,50));  

System.out.println("******************* List of students with marks *********************");
for(Student st:std){
System.out.println(" "+st.name+" "+"has totalmarks "+st.totalmark());  
}
/**
 *  collections class has method sort which only called by implements comparable interface in student class using compareTo method
 */
Collections.sort(std);  
/**
 * Getting Ascending student class object based on marks
 */
System.out.println("******************* Ascending order of student name based on marks *********************");
for(Student st:std){  
System.out.println(" "+st.name+" "+"has totalmarks "+st.totalmark());  
}  
}  
}  