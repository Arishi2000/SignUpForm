package Temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    //Declaring variables
    private EditText Name_Ed, Email_Ed;
    private TextView Error_Name, Error_Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name_Ed = findViewById(R.id.editTextName);
        Error_Name = findViewById(R.id.txtErrorName);
        Email_Ed = findViewById(R.id.editTextEmail);
        Error_Email = findViewById(R.id.txtErrorEmail);
    }

    }

