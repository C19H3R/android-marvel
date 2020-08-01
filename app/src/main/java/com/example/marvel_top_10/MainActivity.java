package com.example.marvel_top_10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    int [] imagest ={R.drawable.thor,R.drawable.doctor,R.drawable.wanda,R.drawable.marvel,R.drawable.vision,R.drawable.ironman,R.drawable.hulk,R.drawable.black,R.drawable.spidy,R.drawable.cap};


    String [] Des={" The Asgardian god of thunder and possesses the enchanted hammer Mjolnir, which grants him the ability of flight and weather manipulation.",
            "Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats.",
            "Wanda has displayed abilities including telekinesis, telepathy, and energy manipulation, like the creation of force fields and bolts of energy.",
            "When head of NASA security Carol Danvers was exposed to a powerful alien device, she transformed into the mighty cosmic powered hero, Captain Marvel!",
            "Vision was an android who possessed a synthetic vibranium body created by Ultron and Helen Cho, along with the powerful space gem known as the Mind Stone. ",
            "A marvel superHero That having Ultimate Replusive Energy.",
            "The Hulk is one of the most powerful beings in the universe since his powers increase with his rage",
            "T’Challa is the king of the secretive and highly advanced African nation of Wakanda - as well as the powerful warrior known as the Black Panther.",
            "He has the ability to shoot web-like material from his wrists, to climb walls and to lift more than 100 times his body weight."
            ,"Recipient of the Super-Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers."};




    String [] namest={"Thor","Doctor Strange","Scarlet witch","Captain marvel",
            "Vision","Ironman","Hulk","Black Panther","Spider Man","Captain America"};

    RecyclerView rc;
    //FirebaseDatabase data;
    //DatabaseReference root;
    //FloatingActionButton add;
   // EditText T,D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // add = findViewById(R.id.add);
        rc = findViewById(R.id.rc);
        //T = findViewById(R.id.topic);
       // D=findViewById(R.id.topic2);
        rc.setLayoutManager(new LinearLayoutManager(MainActivity.this));



        //data=FirebaseDatabase.getInstance();
        //root=data.getReference("todo");
        //final String key=root.push().getKey();


        // root.child(key).setValue(new ToDo("math","ihave to do chapter 2","not done"));
        // root.setValue(new ToDo("math","ihave to do chapter 2","not done"));



        /*add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.child(key).setValue(new ToDo(T.getText().toString(),D.getText().toString(),"not done"))
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "Added", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });*/

          Adapter a = new Adapter(namest,MainActivity.this,imagest,Des);
        //Adapter2 b =new Adapter2(MainActivity.this,D);
         rc.setAdapter(a);

         //rc.setAdapter(b);
        //Adapter2 b = new Adapter2(MainActivity.this,D);
        //rc.setAdapter(b);


        //it is also done.
        //now you can run the code make sure debugging is on or not?
        //on
        //ok

//working fine
        //image array had only nine elements so i have made it 10
        //thankyou sir
        //ok enjoy i m disconnectin it?
        //:) ok sir
    }
}

