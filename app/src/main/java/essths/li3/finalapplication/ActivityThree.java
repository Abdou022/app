package essths.li3.finalapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityThree extends AppCompatActivity {

    Button b1;
    TextView t1;
    private EditText userEmail;
    private EditText password;
    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        initView();
    }
    /*
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();*/


/*

        b1= findViewById(R.id.login_button);
        t1=findViewById(R.id.sign_up_txt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(ActivityThree.this,ActivityFour.class);
                startActivity(i);
                String enteredEmail = userEmail.getText().toString();
                String enteredPassword = password.getText().toString();

                if (enteredEmail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else if (enteredPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                } else {
                    // Check if entered credentials match any user
                    boolean isCredentialsValid = false;
                    for (User user : userList) {
                        if (enteredEmail.equals(user.getEmail()) && enteredPassword.equals(user.getPassword())) {
                            isCredentialsValid = true;
                            break;
                        }
                    }

                    if (isCredentialsValid) {
                        // Successful login
                        //startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                        Toast.makeText(MainActivity.this, "Your email and password are correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Your email or password is not correct", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(ActivityThree.this,ActivityFour.class);
                startActivity(i);
            }
        });
    }
}
*/


    private void initView() {
        userEmail = findViewById(R.id.champs_user);
        password = findViewById(R.id.champs_pwd);
        Button loginBtn = findViewById(R.id.login_button);

        List<User> users = new ArrayList<>();

        users.add(new User(1, "abdou", "abdou@gmail.com", "password1", "res/drawable/img_15848445674101.png", "patient"));
        users.add(new User(2, "nethir", "nethir@gmail.com", "adminadmin", "adminadmin", "doctor"));

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredEmail = userEmail.getText().toString();
                String enteredPassword = password.getText().toString();

                if (enteredEmail.isEmpty()) {
                    Toast.makeText(ActivityThree.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else if (enteredPassword.isEmpty()) {
                    Toast.makeText(ActivityThree.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                } else {
                    // Check if entered credentials match any user
                    boolean isCredentialsValid = false;
                    for (User user : users) {
                        if (enteredEmail.equals(user.getEmail()) && enteredPassword.equals(user.getPassword())) {
                            isCredentialsValid = true;
                            break;
                        }
                    }

                    if (isCredentialsValid) {
                        // Successful login
                        startActivity(new Intent(ActivityThree.this, ActivityFour.class));
                    } else {
                        Toast.makeText(ActivityThree.this, "Your email or password is not correct", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}