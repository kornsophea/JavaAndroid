package com.example.javaandroid;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Activity activity;
    Data data;
    ArrayList<Data> listData=new ArrayList<Data>();
    LayoutInflater layoutInflater=null;

    public Adapter(Activity activity,ArrayList list){
        this.activity=activity;
        this.listData=list;
        layoutInflater=(LayoutInflater) activity.getSystemService(LAYOUT_INFLATER_SERVICE);

}

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private static class ViewHolder{
        TextView txtName;
        TextView txtPhone;
    }
    ViewHolder viewHolder=null;
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        final int  position=i;
        if(v==null){
            viewHolder=new ViewHolder();
            v=layoutInflater.inflate(R.layout.item_list_data,null);
            viewHolder.txtName=v.findViewById(R.id.txt_name);
            viewHolder.txtPhone=v.findViewById(R.id.txt_phone);
            v.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder) v.getTag();
        }
        viewHolder.txtName.setText(listData.get(position).getName());
        viewHolder.txtPhone.setText(listData.get(position).getPhone());
        return v;
    }
}
