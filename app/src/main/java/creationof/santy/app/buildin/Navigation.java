package creationof.santy.app.buildin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Navigation extends AppCompatActivity {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle tg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        tg = new ActionBarDrawerToggle(this,drawer,R.string.open,R.string.close);
        tg.setDrawerIndicatorEnabled(true);


        drawer.addDrawerListener(tg);
        tg.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id= item.getItemId();


                    if (id == R.id.cart){
                        shoping();
                    }else if(id == R.id.media){
                        media();
                    }else if(id == R.id.userprofile)
                    {
                        user();
                    }else if (id == R.id.profile){
                        pro();
                    }

                return true;
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return tg.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    public void shoping(){
        startActivity(new Intent(this,shoping_cart.class));
    }

    public void media(){
        startActivity(new Intent(this,social_media.class));

    }
    public void user(){
        startActivity(new Intent(this,userprofile.class));
    }
    public void pro(){
        startActivity(new Intent(this,ViewDatabase.class));
    }
}
