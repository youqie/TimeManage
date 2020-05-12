package com.bupt.timemaster.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bupt.timemaster.R;
import com.bupt.timemaster.Activities;

import java.util.List;

public class ARightAdapter extends BaseAdapter {
    private Context context;
    List<Activities> list;


    public ARightAdapter(Context context, List<Activities> models) {
        super();
        this.context = context;
        this.list = models;
    }

    @Override
    public int getCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (list != null) {
            return list.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHold viewHold;
        if (convertView == null) {
            viewHold = new ViewHold();
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_right_item_a, parent,false);
//            viewHold.textView1 = (TextView) convertView.findViewById(R.id.right_item_textview0);
//            viewHold.textView2 = (TextView) convertView.findViewById(R.id.right_item_textview1);
//            viewHold.textView3 = (TextView) convertView.findViewById(R.id.right_item_textview2);
//            viewHold.textView4 = (TextView) convertView.findViewById(R.id.right_item_textview3);
//            viewHold.textView5 = (TextView) convertView.findViewById(R.id.right_item_textview4);
//            viewHold.textView6 = (TextView) convertView.findViewById(R.id.right_item_textview5);
//            viewHold.textView7 = (TextView) convertView.findViewById(R.id.right_item_textview6);
            viewHold.textView1 = (View) convertView.findViewById(R.id.right_item_textview0);
            viewHold.textView2 = (View) convertView.findViewById(R.id.right_item_textview1);
            viewHold.textView3 = (View) convertView.findViewById(R.id.right_item_textview2);
            viewHold.textView4 = (View) convertView.findViewById(R.id.right_item_textview3);
            viewHold.textView5 = (View) convertView.findViewById(R.id.right_item_textview4);
            viewHold.textView6 = (View) convertView.findViewById(R.id.right_item_textview5);
            viewHold.textView7 = (View) convertView.findViewById(R.id.right_item_textview6);
            convertView.setTag(viewHold);
        } else {
            viewHold = (ViewHold) convertView.getTag();
        }
        Activities activities = (Activities) getItem(position);
//        viewHold.textView1.setText(activities.getTxt1());
//        viewHold.textView2.setText(activities.getTxt2());
//        viewHold.textView3.setText(activities.getTxt3());
//        viewHold.textView4.setText(activities.getTxt4());
//        viewHold.textView5.setText(activities.getTxt5());
//        viewHold.textView6.setText(activities.getTxt6());
//        viewHold.textView7.setText(activities.getTxt7());
        if(new Integer(activities.getTxt1()) == 1)
        {
            viewHold.textView1.setBackgroundColor(Color.rgb(243, 156, 18));
        }
        if(new Integer(activities.getTxt2()) == 1)
        {
            viewHold.textView2.setBackgroundColor(Color.rgb(26, 188, 156));
        }
        if(new Integer(activities.getTxt3()) == 1)
        {
            viewHold.textView3.setBackgroundColor(Color.rgb(52, 152, 219));
        }
        if(new Integer(activities.getTxt4()) == 1)
        {
            viewHold.textView4.setBackgroundColor(Color.rgb(26, 188, 156));
        }

        return convertView;
    }

    static class ViewHold {

//        TextView  textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    View  textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    }

}
