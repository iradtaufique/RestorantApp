package com.example.design2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Cake","Bread",
            "Pan Cake","Burger",
            "Nut","Cheeps",
            "Fish","Chicken",
            "Roasted Meat","Juice",
            "Potatoes","Rice"
    };

    String[] subtitle ={
            "Flo,milk,eggs,suger","Flo,Milk,Salt,Suger",
            "Flo,Eggs,Salts","Flo,Milk,Eggs,suger",
            "Flo,Milk","Potatoes,Oil,Solt,Onion",
            "Fish,Salt,Oil","Chicken,Oil,Salt",
            "Ghoat/Fish/Rabbit,Oil,Salt","Fruits,Water,Suger",
            "Potatoes","Rice"
    };

    Integer[] imgid={
            R.drawable.download,R.drawable.bread,
            R.drawable.newpancake,R.drawable.burger,
            R.drawable.nuts,R.drawable.download,
            R.drawable.download,R.drawable.download,
            R.drawable.potato,R.drawable.download,
            R.drawable.download,R.drawable.download,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyListView.MyListAdapter adapter=new MyListView.MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item

                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

