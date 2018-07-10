package takshak.mace.takshak2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDesp extends AppCompatActivity {


    private TextView title,description,category;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_desp);

        title = (TextView) findViewById(R.id.title);
        description = (TextView) findViewById(R.id.Desc);
        category = (TextView) findViewById(R.id.category);
        img = (ImageView) findViewById(R.id.thumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        title.setText(Title);
        description.setText(Description);
        img.setImageResource(image);


    }




}
