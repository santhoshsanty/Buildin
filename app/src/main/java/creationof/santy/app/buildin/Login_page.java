package creationof.santy.app.buildin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.widget.Toast.LENGTH_SHORT;

public class Login_page extends AppCompatActivity implements View.OnClickListener{

    private EditText mail,pass;
    private Button button;
    private TextView register;
    private FirebaseAuth mAuth;
    private String userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mail = (EditText) findViewById(R.id.mail);
        pass = (EditText) findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);
        register = (TextView) findViewById(R.id.register);
        button.setOnClickListener(this);
        register.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        userid=user.getUid();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.button):
                login();
                break;
            case (R.id.register):
                reg();
                break;
        }
    }

    public void login(){
        String email = mail.getText().toString().trim();
        String password = pass.getText().toString().trim();

        if(email.isEmpty()||password.isEmpty())
        {
            Toast.makeText(getApplication(),"please fill content",LENGTH_SHORT).show();
        }else {

            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Login_page.this, "login successful", Toast.LENGTH_SHORT).show();
                                login_page();
                            } else {
                                Toast.makeText(Login_page.this, "login unsuccessful", Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });

        }
    }

    public void login_page()
    {
        startActivity(new Intent(this,Navigation.class));
    }
    public void reg(){
        startActivity(new Intent(this,Registration_page.class));
    }
}
