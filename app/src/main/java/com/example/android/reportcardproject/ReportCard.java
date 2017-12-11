package com.example.android.reportcardproject;

import java.util.ArrayList;

/**
 * Created by Barbara on 2017-12-10.
 */

public class ReportCard {
/* ReportCard class
*for student 'mStudentName'
* Custome ArrayList 'mSubjectGrade' contains the list of subjects & grades
 */
    private String mStudentName;
    private ArrayList<SubjectGrade> msubjectGrades= new ArrayList<SubjectGrade>() ;

    /** constructor for ReportCard class for student 'name' */
    public ReportCard(String name ) {
            mStudentName=name;
    }

    /*  get the grade for the 'subject'
     *  returns 0 if not found */
    public double GetGrade(String subject){
        if (msubjectGrades.size()>0) {
            int index = 0;
            while (index< msubjectGrades.size()){
                if(msubjectGrades.get(index).getSubjectName() == subject){
                    return msubjectGrades.get(index).getGrade();
                }
                index++;
            }
        }
        return 0;
    }

    /*  set a grade for a subject, add subject to list if not there */
    public void SetGrade(String subject, double grade){
            int index = 0;
            while (index< msubjectGrades.size()){
                if(msubjectGrades.get(index).getSubjectName() == subject){
                    msubjectGrades.get(index).setGrade(grade);
                    return;
                }
                index++;
            }
            msubjectGrades.add(new SubjectGrade(subject,grade));
        }

    /*  remove a subject/grade from the student's list */
    public void RemoveGrade(String subject){
        int index = 0;
        while (index< msubjectGrades.size()){
            if(msubjectGrades.get(index).getSubjectName() == subject){
                msubjectGrades.remove(index);
                return;
            }
            index++;
        }
    }
/* *Create a summary of the students grades and average
*   return a string with the whole summary */
    public String ReportCardSummary(){
        double AverageGrade = 0;
        int numberOfGrades =0;
        String Summary = "Name: " + mStudentName+ ":\n\n" ;
        int index = 0;
        while (index< msubjectGrades.size()){
            Summary =Summary+ msubjectGrades.get(index).getSubjectName() + ": " + msubjectGrades.get(index).getGrade() + "%\n";
            AverageGrade = AverageGrade+msubjectGrades.get(index).getGrade();
            numberOfGrades++;
            index++;
        }
        /* calculate the average         */
        if (numberOfGrades>0){AverageGrade = AverageGrade/numberOfGrades;}
        Summary=Summary+ "\n"+"Average Grade: " + AverageGrade+"%";
        return Summary;
    }
}
