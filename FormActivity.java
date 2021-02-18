package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    //Declaring the variables as private so they don't get accessed
    private String name, email, password, Password_Confirmed = "";
    private EditText Name_Editing, Email_Editing, Password_Editing, Password_Confirmed_Editing;
    private TextView Error_Name, Error_Email, Error_Password, Error_Password_Confirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name_Editing = findViewById(R.id.editTextName);
        Error_Name = findViewById(R.id.txtErrorName);
        Email_Editing = findViewById(R.id.editTextEmail);
        Error_Email = findViewById(R.id.txtErrorEmail);
        Password_Editing = findViewById(R.id.editTextPassword);
        Error_Password = findViewById(R.id.txtErrorPassword);
        Password_Confirmed_Editing = findViewById(R.id.editTextConfirmPassword);
        Error_Password_Confirmed = findViewById(R.id.txtErrorConfirmPassword);
    }

    // Save button method that has all the functionalities and test cases including the toast messages
    public void save_Button(View view) {
        name = Name_Editing.getText().toString();
        email = Email_Editing.getText().toString();
        password = Password_Editing.getText().toString();
        Password_Confirmed = Password_Confirmed_Editing.getText().toString();

        if (name.equals(""))
            Error_Name.setVisibility(View.VISIBLE);
        else
            Error_Name.setVisibility(View.GONE);
        if (email.equals(""))
            Error_Email.setVisibility(View.VISIBLE);
        else
            Error_Email.setVisibility(View.GONE);
        if (password.equals(""))
            Error_Password.setVisibility(View.VISIBLE);
        else
            Error_Password.setVisibility(View.GONE);
        if (Password_Confirmed.equals("")) {
            Error_Password_Confirmed.setText(R.string.cnf_pass);
            Error_Password_Confirmed.setVisibility(View.VISIBLE);
        } else {
            Error_Password_Confirmed.setText(R.string.password_does_not_match);
            Error_Password_Confirmed.setVisibility(View.GONE);
        }
        if (!Password_Confirmed.equals(password))
            Error_Password_Confirmed.setVisibility(View.VISIBLE);
        else
            Error_Password_Confirmed.setVisibility(View.GONE);
        if (!name.equals("") && !email.equals("") && !password.equals("") && Password_Confirmed.equals(password)) {
            Toast.makeText(this, "Welcome, " + name + ", to the SignUpForm App", Toast.LENGTH_LONG).show();
        }
    }
}

