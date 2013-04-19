package com.pavelalon.smsg.adapters;

import com.pavelalon.smsg.view.R;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	Context context;
	
	public ImageAdapter(Context c) {
		context = c;
	}
	
	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View converView, ViewGroup parent) {
		ImageView imageView;
		if(converView == null){ // if it's not recycled, initialize some attributes
			imageView = new ImageView(context);
//			GridView.LayoutParams lParams = new LayoutParams(context, null);
			imageView.setLayoutParams(new GridView.LayoutParams(85,85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView)converView;
		}
		
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}
	
	// references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

}
