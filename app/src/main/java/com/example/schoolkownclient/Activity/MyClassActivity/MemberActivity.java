package com.example.schoolkownclient.Activity.MyClassActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import com.example.schoolkownclient.Adapter.MyClassAdapter.Myclassadapter;
import com.example.schoolkownclient.Adapter.MyClassAdapter.ParentAdapter;
import com.example.schoolkownclient.Adapter.MyNotificationAdapter.Mynotificationadapter;
import com.example.schoolkownclient.Entities.Studentparent;
import com.example.schoolkownclient.Entities.Teacher;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class MemberActivity extends AppCompatActivity {

    private List<Teacher> teachers = new ArrayList<>();
    private List<Studentparent> studentparents = new ArrayList<>();
    private ListView teacherlist;
    private ListView parentlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        teachers.clear();
        studentparents.clear();
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        teacher.setName("张老师");
        teacher.setPhone("11111111111");
        teachers.add(teacher);

        Teacher teacher1 = new Teacher();
        teacher1.setId(1);
        teacher1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        teacher1.setName("张老师");
        teacher1.setPhone("11111111111");
        teachers.add(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setId(1);
        teacher2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        teacher2.setName("张老师");
        teacher2.setPhone("11111111111");
        teachers.add(teacher2);

        Teacher teacher3 = new Teacher();
        teacher3.setId(1);
        teacher3.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        teacher3.setName("张老师");
        teacher3.setPhone("11111111111");
        teachers.add(teacher3);

        Teacher teacher4 = new Teacher();
        teacher4.setId(1);
        teacher4.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        teacher4.setName("张老师");
        teacher4.setPhone("11111111111");
        teachers.add(teacher4);


        Studentparent studentparent = new Studentparent();
        studentparent.setId(1);
        studentparent.setName("某某某爸爸");
        studentparent.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent.setPhone("22222222222");
        studentparents.add(studentparent);

        Studentparent studentparent1 = new Studentparent();
        studentparent1.setId(1);
        studentparent1.setName("某某某爸爸");
        studentparent1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent1.setPhone("22222222222");
        studentparents.add(studentparent1);

        Studentparent studentparent2 = new Studentparent();
        studentparent2.setId(1);
        studentparent2.setName("某某某爸爸");
        studentparent2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent2.setPhone("22222222222");
        studentparents.add(studentparent2);

        Studentparent studentparent3 = new Studentparent();
        studentparent3.setId(1);
        studentparent3.setName("某某某爸爸");
        studentparent3.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent3.setPhone("22222222222");
        studentparents.add(studentparent3);

        Studentparent studentparent4 = new Studentparent();
        studentparent4.setId(1);
        studentparent4.setName("某某某爸爸");
        studentparent4.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent4.setPhone("22222222222");
        studentparents.add(studentparent4);

        Studentparent studentparent5 = new Studentparent();
        studentparent5.setId(1);
        studentparent5.setName("某某某爸爸");
        studentparent5.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        studentparent5.setPhone("22222222222");
        studentparents.add(studentparent5);

        teacherlist=findViewById(R.id.myclassteacher);
        Myclassadapter myclassadaptery=new Myclassadapter(this,R.layout.listview_class_item,teachers);
        teacherlist.setAdapter(myclassadaptery);

        parentlist=findViewById(R.id.myclassparent);
        ParentAdapter parentAdapter=new ParentAdapter(this,R.layout.listview_class_item,studentparents);
        parentlist.setAdapter(parentAdapter);
    }
}
