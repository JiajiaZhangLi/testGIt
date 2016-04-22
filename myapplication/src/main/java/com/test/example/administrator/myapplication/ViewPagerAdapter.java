package com.test.example.administrator.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/4/20.
 */
public class ViewPagerAdapter extends PagerAdapter{
 private Context context;
    private int[] drawer;
    public ViewPagerAdapter(Context context,int[] drawer)
    {
        this.context=context;
        this.drawer=drawer;

    }
    @Override
    public int getCount() {
        return drawer.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       ImageView  imageview= new ImageView(context);
        LinearLayout.LayoutParams layoutParams= new  LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        imageview.setLayoutParams(layoutParams);
        imageview.setImageResource(drawer[position]);
        return imageview;
    }
//TODO  ViewPager销毁Item
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
