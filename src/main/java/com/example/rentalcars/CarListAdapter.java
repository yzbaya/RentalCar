package com.example.rentalcars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarListAdapter extends ArrayAdapter<Car> {
    private Context mContext;
    private int mResource;

    public CarListAdapter(Context context, int resource, List<Car> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
        }

//        ImageView carImage = convertView.findViewById(R.id.imageView7);
        TextView carName = convertView.findViewById(R.id.nameCar1);
        TextView carInfo1 = convertView.findViewById(R.id.infoKia1);
        TextView carInfo2 = convertView.findViewById(R.id.infoKia2);
        TextView carPrice = convertView.findViewById(R.id.prix1);
        Button reserveButton = convertView.findViewById(R.id.button2);

        Car car = getItem(position);

        if (car != null) {
            carName.setText(car.getName());
            carInfo1.setText(car.getInfo1());
            carInfo2.setText(car.getInfo2());
            carPrice.setText(car.getPrix());
            reserveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        return convertView;
    }
}
