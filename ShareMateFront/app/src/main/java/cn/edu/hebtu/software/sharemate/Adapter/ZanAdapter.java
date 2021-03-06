package cn.edu.hebtu.software.sharemate.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.hebtu.software.sharemate.Bean.NoteBean;
import cn.edu.hebtu.software.sharemate.R;

public class ZanAdapter extends BaseAdapter {

    private Context context;
    private int itemLayout;
    private List<NoteBean> list = new ArrayList();

    public ZanAdapter(Context context, int itemLayout, List<NoteBean> list) {
        this.context = context;
        this.itemLayout = itemLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(null == convertView){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(itemLayout,null);
        }
        ImageView view = convertView.findViewById(R.id.zan);
        view.setImageResource(list.get(position).getNoPhoto());
        TextView textView = convertView.findViewById(R.id.note);
        textView.setText(list.get(position).getTitle().substring(0,6)+"..");
        return convertView;
    }
}
