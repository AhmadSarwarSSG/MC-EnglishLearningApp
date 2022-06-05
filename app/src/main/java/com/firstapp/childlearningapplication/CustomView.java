package com.firstapp.childlearningapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.firstapp.childlearningapplication.Question;

import java.util.ArrayList;

public class CustomView extends ArrayAdapter{
    private final ArrayList<String> options;
    private Activity context;
    public CustomView(Activity context, ArrayList<String> options) {
        super(context, R.layout.activity_custom_list_view, options);
        this.options = options;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(R.layout.activity_custom_list_view, null, true);
        TextView alpha=singleEntityView.findViewById(R.id.textView2);
        alpha.setText(options.get(position));
        return singleEntityView;
    }
}