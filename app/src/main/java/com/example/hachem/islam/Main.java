package com.example.hachem.islam;

    import android.app.Activity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageButton;
    import android.widget.TextView;

public class Main extends Activity {

    public  ImageButton b1;
    public  ImageButton b2;
    public  ImageButton b3;
    public  ImageButton b4;

    public  TextView t1;
    public  TextView t2;
    public  TextView t3;
    public  TextView t4;

    public  ImageButton totale;
    public  TextView afficher;

    public int n1=0;
    public int n2=0;
    public int n3=0;
    public int n4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b1=(ImageButton)findViewById(R.id.b1);
        b2=(ImageButton)findViewById(R.id.b2);
        b3=(ImageButton)findViewById(R.id.b3);
        b4=(ImageButton)findViewById(R.id.b4);

        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);

        totale=(ImageButton)findViewById(R.id.totale);
        afficher=(TextView)findViewById(R.id.affiche);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1++;t1.setText(n1+"");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n2++;t2.setText(n2+"");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n3++;t3.setText(n3+"");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n4++;t4.setText(n4+"");
            }
        });
        totale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int s=n1+n2+n3+n4;
                afficher.setText(s+"");
            }
        });
    }
}
