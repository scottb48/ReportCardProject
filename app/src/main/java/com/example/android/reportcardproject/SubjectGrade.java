package com.example.android.reportcardproject;

/**
 * Created by Barbara on 2017-12-10.
 */

public class SubjectGrade {
    /**     * the subject     */
    private String mSubject;
    /**     * the grade     */
    private double mGrade;
    /**
     * Create a new SubjectGrade object.
     */
    public SubjectGrade(String subject,double grade) {
        mSubject = subject;
        mGrade = grade;
    }
    /**     * Get the subject name.     */
    public String getSubjectName() {
        return mSubject;
    }
    /**     * Get the grade     */
    public double getGrade() {
        return mGrade;
    }
    /**     set the grade   */
    public void setGrade(double grade) {
        mGrade = grade;
    }
}
