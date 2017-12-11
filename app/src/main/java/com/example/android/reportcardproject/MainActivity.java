package com.example.android.reportcardproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* create a ReportCard object for a student*/
        ReportCard reportCard = new ReportCard("Joe Smith");
        /* set the grades for some subjects */
        reportCard.SetGrade("Chemistry", 85);
        reportCard.SetGrade("Math", 88);
        reportCard.SetGrade("English", 75);
        reportCard.SetGrade("Biology", 65);
        /** reset Math grade */
        reportCard.SetGrade("Math", 90);
        /** remove the Biology grade */
        reportCard.RemoveGrade("Biology");
        /**set a Physics grade */
        reportCard.SetGrade("Physics", 77);
        /* Create a summary of students grades */
        String Summary = reportCard.ReportCardSummary();
        /* display summary */
        TextView textView = (TextView) findViewById(R.id.StudentSummary);
        textView.setText(Summary);

    }
}
