/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
/**
 * <h1>Student model class contain name, marks for 5 subjects.</h1>
 * @author Divya gate
 */
class Student implements Comparable<Student>{  
String name;
   double maths;
   double science;
   double debugging;
   double oop;
   double datastructure;
   
   /**
    *  parameterized constructor
    * @param name of student
    * @param maths subject mark
    * @param science subject mark
    * @param datastructure subject mark
    * @param debugging subject mark
    * @param oop subject mark
    */
   public Student(String name, double maths,double science,double datastructure,double debugging,double oop){
   this.name =name;
   this.maths= maths;
   this.science=science;
   this.datastructure=datastructure;
   this.debugging=debugging;
   this.oop= oop;
   
   }
   /**
    * function for calculate marks
    * @return total marks
    */
   public double totalmark(){
   double total= maths + science + debugging + oop + datastructure;
   return total ;
   }
  /**
   * compare total marks of student with other student
   * @param st
   * @return inter
   */
   
public int compareTo(Student st){  
if(this.totalmark()==st.totalmark())  
return 0;  
else if(this.totalmark()>st.totalmark())  
return 1;  
else  
return -1;  
}  
}  