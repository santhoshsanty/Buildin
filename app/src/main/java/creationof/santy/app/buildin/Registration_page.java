package creationof.santy.app.buildin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.widget.Toast.LENGTH_SHORT;

public class Registration_page extends AppCompatActivity implements View.OnClickListener{

    EditText mail,pass;
    private FirebaseAuth mAuth;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        mail = (EditText) findViewById(R.id.mail);
        pass = (EditText) findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button):
                register();
                break;
        }
    }

    public  void register(){
        String email = mail.getText().toString().trim();
        String password = pass.getText().toString().trim();

        if(email.isEmpty()||password.isEmpty())
        {
            Toast.makeText(getApplication(),"please fill content",LENGTH_SHORT).show();
        }else{

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                             /*   Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user); */
                                Toast.makeText(Registration_page.this, "Registration successfull", Toast.LENGTH_SHORT).show();
                                log();
                            } else {
                                // If sign in fails, display a message to the user.
                              /*  Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                updateUI(null); */
                                Toast.makeText(Registration_page.this, "Registration unsuccessfull", Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });

        }

    }
    public void log()
    {
        startActivity(new Intent(this,Login_page.class));
    }
}

