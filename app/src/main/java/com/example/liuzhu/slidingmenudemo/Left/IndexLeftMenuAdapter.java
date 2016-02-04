package com.example.liuzhu.slidingmenudemo.Left;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liuzhu.slidingmenudemo.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhu on 16/1/19.
 */
public class IndexLeftMenuAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> titles;
    private LayoutInflater mInfalter = null;

    public IndexLeftMenuAdapter(Context context){
        this.mContext = context;
        mInfalter = LayoutInflater.from(context);
        titles = new ArrayList<>(Arrays.asList("我的资料","天气预览","系统设置","关于我们"));

    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInfalter.inflate(R.layout.index_leftmenu_item, null);
            holder.icon = (ImageView) convertView.findViewById(R.id.left_menu_listitem_icon);
            holder.title = (TextView) convertView.findViewById(R.id.left_menu_listitem_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.title.setText(titles.get(position));
        switch (position)
        {
            case 0: {
                holder.icon.setImageResource(R.mipmap.ic_launcher);
                break;
            }
            case 1:{
                holder.icon.setImageResource(R.mipmap.ic_launcher);
                break;
            }
            case 2:{
                holder.icon.setImageResource(R.mipmap.ic_launcher);
                break;
            }
            case 3:{
                holder.icon.setImageResource(R.mipmap.ic_launcher);
                break;
            }
            default:{
                break;
            }
        }
        return convertView;
    }

    class ViewHolder{
        ImageView icon;
        TextView title;
    }
}
