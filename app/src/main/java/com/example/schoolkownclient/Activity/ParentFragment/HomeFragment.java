package com.example.schoolkownclient.Activity.ParentFragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.schoolkownclient.Activity.MyClassActivity.MemberActivity;
import com.example.schoolkownclient.Adapter.HomeAdapter.CustomAbilityAdapter;
import com.example.schoolkownclient.Adapter.HomeAdapter.CustomArticleAdapter;
import com.example.schoolkownclient.Entities.Ability;
import com.example.schoolkownclient.Entities.Article;
import com.example.schoolkownclient.Entities.GlideImageLoader;
import com.example.schoolkownclient.Entities.ListViewHeight;
import com.example.schoolkownclient.Entities.MyGridView;
import com.example.schoolkownclient.Entities.Teacher;
import com.example.schoolkownclient.R;
import com.youth.banner.Banner;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private SearchView mSearchView;
    private View view;
    private List<String> images=new ArrayList<>();
    private List<String> titles=new ArrayList<>();
    private List<Article> articles=new ArrayList<>();
    private Banner banner;
    private MyGridView abilityGridView;
    private ListView articleListView;
    private List<Ability> abilities=new ArrayList<>();
    private TextView myclass;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_home, container, false);
            //获取控件
            mSearchView = (SearchView) view.findViewById(R.id.searchView);
            abilityGridView=view.findViewById(R.id.gridview_ability);
            myclass = view.findViewById(R.id.myclass);
            banner=view.findViewById(R.id.home_banner);
            initArticle();
            articleListView=view.findViewById(R.id.listview_article);
            CustomArticleAdapter customArticleAdapter=new CustomArticleAdapter(getContext(),R.layout.listview_article_item,articles);
            articleListView.setAdapter(customArticleAdapter);
            ListViewHeight.setListViewHeightBasedOnChildren(articleListView);
            initAbility();
            CustomAbilityAdapter customAbilityAdapter=new CustomAbilityAdapter(getContext(),R.layout.gridview_ability_item,abilities);
            abilityGridView.setAdapter(customAbilityAdapter);
        }
        mSearchView.setSubmitButtonEnabled(true);
        //设置监听事件
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getContext(), query, Toast.LENGTH_SHORT).show();

                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        images.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1968633353,4219736989&fm=15&gp=0.jpg");
        images.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2342324247,2362231983&fm=11&gp=0.jpg");
        images.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=124643587,619926761&fm=11&gp=0.jpg");
        images.add("https://dss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1317487759,3407358820&fm=26&gp=0.jpg");
        images.add("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1431143171,4188915397&fm=26&gp=0.jpg");

        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

        //myclass点击事件
        myclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MemberActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }
    public void initArticle(){
        Article article1=new Article();
        article1.setTitle("家长必看：教育孩子的七大误区");
        article1.setIntrodction("婷婷老师那些事儿");
        article1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.article1));
        articles.add(article1);
        Article article2=new Article();
        article2.setTitle("亲子柚子中父母常见的六大错误做法");
        article2.setIntrodction("幸福教育");
        article2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.article2));
        articles.add(article2);
        Article article3=new Article();
        article3.setTitle("表扬or批评？家庭教育中的回环效应");
        article3.setIntrodction("婷婷老师那些事儿");
        article3.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.article3));
        articles.add(article3);
        Article article4=new Article();
        article4.setTitle("家长必看：教育孩子的七大误区");
        article4.setIntrodction("婷婷老师那些事儿");
        article4.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.article4));
        articles.add(article4);
    }
    public void initAbility(){
        Ability ability1=new Ability();
        ability1.setTitle("1-6岁舞蹈启蒙：萌娃才艺");
        ability1.setIntroduction("面向1-6岁幼儿");
        ability1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ability1));
        abilities.add(ability1);
        Ability ability2=new Ability();
        ability2.setTitle("乐器启蒙国际幼儿园");
        ability2.setIntroduction("1-6岁乐器启蒙");
        ability2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ability2));
        abilities.add(ability2);
        Ability ability3=new Ability();
        ability3.setTitle("外教儿歌");
        ability3.setIntroduction("英语儿歌启蒙");
        ability3.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ability3));
        abilities.add(ability3);
        Ability ability4=new Ability();
        ability4.setTitle("精选0-6岁必读早教启蒙绘本");
        ability4.setIntroduction("打开绘本阅读新视野");
        ability4.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ability4));
        abilities.add(ability4);
    }
}
