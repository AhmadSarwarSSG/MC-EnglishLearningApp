package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;
    Button j;
    Button k;
    Button l;
    Button m;
    Button n;
    Button o;
    Button p;
    Button q;
    Button r;
    Button s;
    Button t;
    Button u;
    Button v;
    Button w;
    Button x;
    Button y;
    Button z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.button);
        b=findViewById(R.id.button4);
        c=findViewById(R.id.button2);
        d=findViewById(R.id.button3);
        e=findViewById(R.id.button5);
        f=findViewById(R.id.button6);
        g=findViewById(R.id.button7);
        h=findViewById(R.id.button8);
        i=findViewById(R.id.button9);
        j=findViewById(R.id.button10);
        k=findViewById(R.id.button11);
        l=findViewById(R.id.button13);
        m=findViewById(R.id.button12);
        n=findViewById(R.id.button14);
        o=findViewById(R.id.button15);
        p=findViewById(R.id.button16);
        q=findViewById(R.id.button17);
        r=findViewById(R.id.button18);
        s=findViewById(R.id.button19);
        t=findViewById(R.id.button20);
        u=findViewById(R.id.button21);
        v=findViewById(R.id.button22);
        w=findViewById(R.id.button23);
        x=findViewById(R.id.button24);
        y=findViewById(R.id.button25);
        z=findViewById(R.id.button26);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                Intent intent=new Intent(this, displau.class);
                intent.putExtra("text", "A");
                intent.putExtra("picture", R.drawable.a);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intentb=new Intent(this, displau.class);
                intentb.putExtra("text", "B");
                intentb.putExtra("picture", R.drawable.b);
                startActivity(intentb);
                break;
            case R.id.button2:
                Intent intentc=new Intent(this, displau.class);
                intentc.putExtra("text", "C");
                intentc.putExtra("picture", R.drawable.c);
                startActivity(intentc);
                break;
            case R.id.button3:
                Intent intentd=new Intent(this, displau.class);
                intentd.putExtra("text", "D");
                intentd.putExtra("picture", R.drawable.d);
                startActivity(intentd);
                break;
            case R.id.button5:
                Intent intente=new Intent(this, displau.class);
                intente.putExtra("text", "E");
                intente.putExtra("picture", R.drawable.e);
                startActivity(intente);
                break;
            case R.id.button6:
                Intent intentf=new Intent(this, displau.class);
                intentf.putExtra("text", "F");
                intentf.putExtra("picture", R.drawable.f);
                startActivity(intentf);
                break;
            case R.id.button7:
                Intent intentg=new Intent(this, displau.class);
                intentg.putExtra("text", "G");
                intentg.putExtra("picture", R.drawable.g);
                startActivity(intentg);
                break;
            case R.id.button8:
                Intent intenth=new Intent(this, displau.class);
                intenth.putExtra("text", "H");
                intenth.putExtra("picture", R.drawable.h);
                startActivity(intenth);
                break;
            case R.id.button9:
                Intent intenti=new Intent(this, displau.class);
                intenti.putExtra("text", "I");
                intenti.putExtra("picture", R.drawable.i);
                startActivity(intenti);
                break;
            case R.id.button10:
                Intent intentj=new Intent(this, displau.class);
                intentj.putExtra("text", "J");
                intentj.putExtra("picture", R.drawable.j);
                startActivity(intentj);
                break;
            case R.id.button11:
                Intent intentk=new Intent(this, displau.class);
                intentk.putExtra("text", "K");
                intentk.putExtra("picture", R.drawable.k);
                startActivity(intentk);
                break;
            case R.id.button13:
                Intent intentl=new Intent(this, displau.class);
                intentl.putExtra("text", "L");
                intentl.putExtra("picture", R.drawable.l);
                startActivity(intentl);
                break;
            case R.id.button12:
                Intent intentm=new Intent(this, displau.class);
                intentm.putExtra("text", "M");
                intentm.putExtra("picture", R.drawable.m);
                startActivity(intentm);
                break;
            case R.id.button14:
                Intent intentn=new Intent(this, displau.class);
                intentn.putExtra("text", "N");
                intentn.putExtra("picture", R.drawable.n);
                startActivity(intentn);
                break;
            case R.id.button15:
                Intent intento=new Intent(this, displau.class);
                intento.putExtra("text", "O");
                intento.putExtra("picture", R.drawable.o);
                startActivity(intento);
                break;
            case R.id.button16:
                Intent intentp=new Intent(this, displau.class);
                intentp.putExtra("text", "P");
                intentp.putExtra("picture", R.drawable.p);
                startActivity(intentp);
                break;
            case R.id.button17:
                Intent intentq=new Intent(this, displau.class);
                intentq.putExtra("text", "Q");
                intentq.putExtra("picture", R.drawable.q);
                startActivity(intentq);
                break;
            case R.id.button18:
                Intent intentr=new Intent(this, displau.class);
                intentr.putExtra("text", "R");
                intentr.putExtra("picture", R.drawable.r);
                startActivity(intentr);
                break;
            case R.id.button19:
                Intent intents=new Intent(this, displau.class);
                intents.putExtra("text", "S");
                intents.putExtra("picture", R.drawable.s);
                startActivity(intents);
                break;
            case R.id.button20:
                Intent intentt=new Intent(this, displau.class);
                intentt.putExtra("text", "T");
                intentt.putExtra("picture", R.drawable.t);
                startActivity(intentt);
                break;
            case R.id.button21:
                Intent intentu=new Intent(this, displau.class);
                intentu.putExtra("text", "U");
                intentu.putExtra("picture", R.drawable.u);
                startActivity(intentu);
                break;
            case R.id.button22:
                Intent intentv=new Intent(this, displau.class);
                intentv.putExtra("text", "V");
                intentv.putExtra("picture", R.drawable.v);
                startActivity(intentv);
                break;
            case R.id.button23:
                Intent intentw=new Intent(this, displau.class);
                intentw.putExtra("text", "W");
                intentw.putExtra("picture", R.drawable.w);
                startActivity(intentw);
                break;
            case R.id.button24:
                Intent intentx=new Intent(this, displau.class);
                intentx.putExtra("text", "X");
                intentx.putExtra("picture", R.drawable.x);
                startActivity(intentx);
                break;
            case R.id.button25:
                Intent intenty=new Intent(this, displau.class);
                intenty.putExtra("text", "Y");
                intenty.putExtra("picture", R.drawable.y);
                startActivity(intenty);
                break;
            case R.id.button26:
                Intent intentz=new Intent(this, displau.class);
                intentz.putExtra("text", "Z");
                intentz.putExtra("picture", R.drawable.z);
                startActivity(intentz);
                break;

        }
    }
}