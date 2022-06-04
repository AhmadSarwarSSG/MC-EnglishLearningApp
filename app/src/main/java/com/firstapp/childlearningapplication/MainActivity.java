package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

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
                intent.putExtra("description", "Apple");
                intent.putExtra("audio", R.raw.a_apple);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intentb=new Intent(this, displau.class);
                intentb.putExtra("text", "B");
                intentb.putExtra("picture", R.drawable.b);
                intentb.putExtra("description", "Banana");
                intentb.putExtra("audio", R.raw.b_banana);
                startActivity(intentb);
                break;
            case R.id.button2:
                Intent intentc=new Intent(this, displau.class);
                intentc.putExtra("text", "C");
                intentc.putExtra("picture", R.drawable.c);
                intentc.putExtra("description", "Cat");
                intentc.putExtra("audio", R.raw.c_cat);
                startActivity(intentc);
                break;
            case R.id.button3:
                Intent intentd=new Intent(this, displau.class);
                intentd.putExtra("text", "D");
                intentd.putExtra("picture", R.drawable.d);
                intentd.putExtra("description", "Dog");
                intentd.putExtra("audio", R.raw.d_dog);
                startActivity(intentd);
                break;
            case R.id.button5:
                Intent intente=new Intent(this, displau.class);
                intente.putExtra("text", "E");
                intente.putExtra("picture", R.drawable.e);
                intente.putExtra("description", "Elephant");
                intente.putExtra("audio", R.raw.e_elephant);
                startActivity(intente);
                break;
            case R.id.button6:
                Intent intentf=new Intent(this, displau.class);
                intentf.putExtra("text", "F");
                intentf.putExtra("picture", R.drawable.f);
                intentf.putExtra("description", "Frog");
                intentf.putExtra("audio", R.raw.f_frog);
                startActivity(intentf);
                break;
            case R.id.button7:
                Intent intentg=new Intent(this, displau.class);
                intentg.putExtra("text", "G");
                intentg.putExtra("picture", R.drawable.g);
                intentg.putExtra("description", "Giraffe");
                intentg.putExtra("audio", R.raw.g_giraffe);
                startActivity(intentg);
                break;
            case R.id.button8:
                Intent intenth=new Intent(this, displau.class);
                intenth.putExtra("text", "H");
                intenth.putExtra("picture", R.drawable.h);
                intenth.putExtra("description", "Hen");
                intenth.putExtra("audio", R.raw.h_hen);
                startActivity(intenth);
                break;
            case R.id.button9:
                Intent intenti=new Intent(this, displau.class);
                intenti.putExtra("text", "I");
                intenti.putExtra("picture", R.drawable.i);
                intenti.putExtra("description", "Ice-Cream");
                intenti.putExtra("audio", R.raw.i_icecream);
                startActivity(intenti);
                break;
            case R.id.button10:
                Intent intentj=new Intent(this, displau.class);
                intentj.putExtra("text", "J");
                intentj.putExtra("picture", R.drawable.j);
                intentj.putExtra("description", "Jelly Fish");
                intentj.putExtra("audio", R.raw.j_jellyfish);
                startActivity(intentj);
                break;
            case R.id.button11:
                Intent intentk=new Intent(this, displau.class);
                intentk.putExtra("text", "K");
                intentk.putExtra("picture", R.drawable.k);
                intentk.putExtra("description", "Kite");
                intentk.putExtra("audio", R.raw.k_kite);
                startActivity(intentk);
                break;
            case R.id.button13:
                Intent intentl=new Intent(this, displau.class);
                intentl.putExtra("text", "L");
                intentl.putExtra("picture", R.drawable.l);
                intentl.putExtra("description", "Leamon");
                intentl.putExtra("audio", R.raw.l_leamon);
                startActivity(intentl);
                break;
            case R.id.button12:
                Intent intentm=new Intent(this, displau.class);
                intentm.putExtra("text", "M");
                intentm.putExtra("picture", R.drawable.m);
                intentm.putExtra("description", "Mango");
                intentm.putExtra("audio", R.raw.m_mango);
                startActivity(intentm);
                break;
            case R.id.button14:
                Intent intentn=new Intent(this, displau.class);
                intentn.putExtra("text", "N");
                intentn.putExtra("picture", R.drawable.n);
                intentn.putExtra("description", "Nose");
                intentn.putExtra("audio", R.raw.n_nose);
                startActivity(intentn);
                break;
            case R.id.button15:
                Intent intento=new Intent(this, displau.class);
                intento.putExtra("text", "O");
                intento.putExtra("picture", R.drawable.o);
                intento.putExtra("description", "Orange");
                intento.putExtra("audio", R.raw.o_orange);
                startActivity(intento);
                break;
            case R.id.button16:
                Intent intentp=new Intent(this, displau.class);
                intentp.putExtra("text", "P");
                intentp.putExtra("picture", R.drawable.p);
                intentp.putExtra("description", "Potato");
                intentp.putExtra("audio", R.raw.p_potato);
                startActivity(intentp);
                break;
            case R.id.button17:
                Intent intentq=new Intent(this, displau.class);
                intentq.putExtra("text", "Q");
                intentq.putExtra("picture", R.drawable.q);
                intentq.putExtra("description", "Queen");
                intentq.putExtra("audio", R.raw.q_queen);
                startActivity(intentq);
                break;
            case R.id.button18:
                Intent intentr=new Intent(this, displau.class);
                intentr.putExtra("text", "R");
                intentr.putExtra("picture", R.drawable.r);
                intentr.putExtra("description", "Rose");
                intentr.putExtra("audio", R.raw.r_rose);
                startActivity(intentr);
                break;
            case R.id.button19:
                Intent intents=new Intent(this, displau.class);
                intents.putExtra("text", "S");
                intents.putExtra("picture", R.drawable.s);
                intents.putExtra("description", "Snake");
                intents.putExtra("audio", R.raw.s_snake);
                startActivity(intents);
                break;
            case R.id.button20:
                Intent intentt=new Intent(this, displau.class);
                intentt.putExtra("text", "T");
                intentt.putExtra("picture", R.drawable.t);
                intentt.putExtra("description", "Tree");
                intentt.putExtra("audio", R.raw.t_tree);
                startActivity(intentt);
                break;
            case R.id.button21:
                Intent intentu=new Intent(this, displau.class);
                intentu.putExtra("text", "U");
                intentu.putExtra("picture", R.drawable.u);
                intentu.putExtra("description", "Umbrella");
                intentu.putExtra("audio", R.raw.u_umbrella);
                startActivity(intentu);
                break;
            case R.id.button22:
                Intent intentv=new Intent(this, displau.class);
                intentv.putExtra("text", "V");
                intentv.putExtra("picture", R.drawable.v);
                intentv.putExtra("description", "Village");
                intentv.putExtra("audio", R.raw.v_village);
                startActivity(intentv);
                break;
            case R.id.button23:
                Intent intentw=new Intent(this, displau.class);
                intentw.putExtra("text", "W");
                intentw.putExtra("picture", R.drawable.w);
                intentw.putExtra("description", "Wheat");
                intentw.putExtra("audio", R.raw.w_wheat);
                startActivity(intentw);
                break;
            case R.id.button24:
                Intent intentx=new Intent(this, displau.class);
                intentx.putExtra("text", "X");
                intentx.putExtra("picture", R.drawable.x);
                intentx.putExtra("description", "X-Ray");
                intentx.putExtra("audio", R.raw.x_xray);
                startActivity(intentx);
                break;
            case R.id.button25:
                Intent intenty=new Intent(this, displau.class);
                intenty.putExtra("text", "Y");
                intenty.putExtra("picture", R.drawable.y);
                intenty.putExtra("description", "Yacht");
                intenty.putExtra("audio", R.raw.y_yacht);
                startActivity(intenty);
                break;
            case R.id.button26:
                Intent intentz=new Intent(this, displau.class);
                intentz.putExtra("text", "Z");
                intentz.putExtra("picture", R.drawable.z);
                intentz.putExtra("description", "Zebra");
                intentz.putExtra("audio", R.raw.z_zebra);
                startActivity(intentz);
                break;

        }
    }
}