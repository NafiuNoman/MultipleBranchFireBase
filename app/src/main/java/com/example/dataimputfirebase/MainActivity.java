package com.example.dataimputfirebase;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    EditText name, age ,roll, major,food,drink,gender,game;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.IdName);
        age = findViewById(R.id.IdAge);
        roll = findViewById(R.id.IdRoll);
        major = findViewById(R.id.IdMajor);
        food = findViewById(R.id.IdFood);
        game = findViewById(R.id.IdGame);
        drink = findViewById(R.id.IdDrink);
        gender = findViewById(R.id.idGender);

        btn = findViewById(R.id.Idbutton);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                send();


            }
        });


    }

    private void send()


    {
        String sName = name.getText().toString().trim();
        String sAge = age.getText().toString().trim();
        String sRoll = roll.getText().toString().trim();
        String sMajor =major.getText().toString();
        String sGender = gender.getText().toString().trim();
        String sGame = game.getText().toString().trim();
        String sDrink = drink.getText().toString().trim();
        String sFood =food.getText().toString();

        DataHolder obj = new DataHolder(sName,sAge,sMajor);
        DataHolder obj1 = new DataHolder(sGame,sDrink,sFood,sGender);


        FirebaseDatabase db = FirebaseDatabase.getInstance();

//        DatabaseReference reference = db.getReference("Student");
//        reference.child("s1").child(sGender).setValue(obj1);
//
//
//       DatabaseReference reference1 = db.getReference("Student");
//        reference1.child("s1").child(sName).setValue(obj);



        DatabaseReference reference = db.getReference("Student");
        reference.child(sName).child(sGender).setValue(obj1);


        DatabaseReference reference1 = db.getReference("Student");
        reference1.child(sName).child(sRoll).setValue(obj);


        name.setText("");
        roll.setText("");
        major.setText("");
        age.setText("");
        gender.setText("");
        game.setText("");
        food.setText("");
        drink.setText("");

        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();



    }


}