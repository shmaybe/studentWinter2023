/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author MayxT
 */
public class parttimestudent extends Student{
    
    private int noOfCourse ;
    
    public int getNoOfCourse(){
        return noOfCourse;
    }
    public void setNoOfCourse(int noOfCourse){
        this.noOfCourse = noOfCourse;
    }
    
    public parttimestudent(String studentID, String studentName)
    {
        super(studentID, studentName);
    }
}
