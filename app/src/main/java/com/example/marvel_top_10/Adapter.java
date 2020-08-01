package com.example.marvel_top_10;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.marvel_top_10.MainActivity;

import com.example.marvel_top_10.R;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    String[] names;
    Context c;
    int[] images;
    String[] intro;

    public Adapter(String[] names, Context c, int[] images, String[] intro) {
        this.names = names;
        this.c = c;
        this.images = images;
        this.intro = intro;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup vg, int i) {

        //now we are converting the card.xml into java object.

        LayoutInflater inflater=LayoutInflater.from(c);// calling layout infalator service.

        View v=inflater.inflate(R.layout.card,vg,false);

        return new Holder(v);

        //so far code is fine

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        //in this function we call only wigets object and we do manipulation on that only.

        // so we name list ,we have intro list and we have image id list that we can set image resources.

        //throug the index position we  are going to access the elements of aarar of image, name nd intro.


        // i hope so far we ahve clear with things?

        //Yes sir
        //----------------------------------------now we going to code---------------------------

        holder.name.setText(names[i]); // we have seted the name
        holder.intro.setText(intro[i]);
       holder.avtar.setImageResource(images[i]);


        //we have done with the whole adapter so next target to mainactivity, Ready?
        //yes sir





    }

    @Override
    public int getItemCount() {
        return names.length;

        //make sure every array you are passing having same lenght.?
        // got it
        //fine
    }

    class Holder extends RecyclerView.ViewHolder{


   //so we have used two textview nad one imageView, that we need to take two object of text view and one object of ImageView i thik is that clear?


        //ok sir
        //ok fine we are just decalaroing things

        TextView name,intro;
        ImageView avtar;



        public Holder(@NonNull View it) {
            super(it);


            name=it.findViewById(R.id.name);
            intro=it.findViewById(R.id.intro);
            avtar=it.findViewById(R.id.avtar);


            //we have done with this function only.
        }
    }
}
