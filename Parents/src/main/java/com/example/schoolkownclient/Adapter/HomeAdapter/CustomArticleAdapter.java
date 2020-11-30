package com.example.schoolkownclient.Adapter.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Article;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomArticleAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Article> articles=new ArrayList<>();

    public CustomArticleAdapter(Context context, int res, List<Article> articles) {
        this.context = context;
        this.res = res;
        this.articles = articles;
    }

    @Override
    public int getCount() {
        if(articles!=null){
            return articles.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(articles!= null){
            return articles.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(res,null);
        ImageView imageView=convertView.findViewById(R.id.article_item_img);
        TextView title=convertView.findViewById(R.id.article_item_title);
        TextView introduction=convertView.findViewById(R.id.article_item_introduction);
        imageView.setImageBitmap(articles.get(position).getBitmap());
        title.setText(articles.get(position).getTitle());
        introduction.setText(articles.get(position).getIntrodction());
        return convertView;
    }
}
