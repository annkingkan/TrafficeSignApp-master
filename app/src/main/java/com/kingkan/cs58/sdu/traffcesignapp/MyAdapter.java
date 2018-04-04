package com.kingkan.cs58.sdu.traffcesignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//คลาสนี้ทำหน้าที่เป็น Layout เสมือน เพื่อเข้าไปแสดงผลบนหน้า Main
public class MyAdapter extends BaseAdapter{
    private Context context;
    private int[] ints; //เก็บข้อมูลโลโก้ป้ายจราจร
    private String[]titleStrings,detailStrings; //เก็บชื่อ title,detail

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลในArray แล้วส่งข้อมูลไปยัง methot getView
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //รับข้อมุลจาก getCount มาแสดงผล
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1=layoutInflater.inflate(R.layout.my_listview,viewGroup,false);

        //ผูกตัวแปลบนจาวา กับ xml ที่หน้า my_listview
        ImageView imageView =view1.findViewById(R.id.imageView);
        TextView titleTextView=view1.findViewById(R.id.txv1);
        TextView datailTextView=view1.findViewById(R.id.txv2);

        //นำข้อมูลไปแสดงผลบนแอป
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        datailTextView.setText(detailStrings[i]);

        return view1;
    }
}//end Class
