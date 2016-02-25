package myapp.example.oskrlarios.app2;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends ActionBarActivity implements Button.OnClickListener{

    /*declaro una vairable que llevara el contenido que mostrar mi imagen*/
    private ImageView fondo;
    private Button fondo2,fondo3;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
       /* client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();*/
        /*aqui estoy asignando el valor que contenga mi variable de mi Widget */
        fondo=(ImageView)findViewById(R.id.imgViewFondo);
        //aqui estoy haciendo que mi variable tome el valor que tenga la propiedad de mi btnImg2
        fondo2=(Button)findViewById(R.id.btnImg2);
        //aqui estoy haciendo que mi variable tome el valor que tenga la propiedad de mi btnImg3
        fondo3=(Button)findViewById(R.id.btnImg3);
        //aquie stamos pasando la instancia a traves del this y asi escuche el evento onClick
        fondo3.setOnClickListener(this);
        //Aqui estoy instanciando ahora el evento de click para mi btnImg2

        fondo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fondo.setImageResource(R.mipmap.chin2);
            }
        });



    }

    /*Aquie generare mi evento de miEventClick*/
    public void miEventClick(View view) {
        /*La variable que cree,ahora tomara las propiedades de nuestra imagen el cual se mostrara
        * en el ImageView*/
        fondo.setImageResource(R.mipmap.chin1);
    }

    @Override
    public void onClick(View view) {
        fondo.setImageResource(R.mipmap.chin3);
    }
}
