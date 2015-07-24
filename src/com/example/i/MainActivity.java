package com.example.i;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
	Pie_Chart pie_chart;
	Bar_chart bar_chart;
	LinearLayout pie_chart_layout;
	LinearLayout layout;
	LinearLayout strip_chart_layout;
	Button create_pie_but;
	Button create_strip_but;
	Button back_but;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=(LinearLayout)findViewById(R.id.layout);
        pie_chart_layout=(LinearLayout)findViewById(R.id.pie_chart);
        strip_chart_layout=(LinearLayout)findViewById(R.id.strip_chart);
        
        create_pie_but=(Button)findViewById(R.id.create_pie_but);
        create_strip_but=(Button)findViewById(R.id.create_strip_but);
        back_but=(Button)findViewById(R.id.back_but);
    }
    
    public void create_pie_but(View v){
    	visible_chart();
    	pie_chart=new Pie_Chart(this,pie_chart_layout);
        pie_chart.create_pie();
    }
    
    public void create_strip_but(View v){
    	bar_chart=new Bar_chart(this,strip_chart_layout);
    	bar_chart.create_bar_horizontal();
    	visible_chart();
    }
    
    public void back_but(View v){
    	gone_chart();

    }
    public void gone_chart(){
    	create_pie_but.setVisibility(View.VISIBLE);
    	create_strip_but.setVisibility(View.VISIBLE);
    	back_but.setVisibility(View.INVISIBLE);
    	layout.setVisibility(View.INVISIBLE);
    	pie_chart_layout.removeAllViews();
    	strip_chart_layout.removeAllViews();
    }
    public void visible_chart(){
    	create_pie_but.setVisibility(View.INVISIBLE);
    	create_strip_but.setVisibility(View.INVISIBLE);
    	back_but.setVisibility(View.VISIBLE);
    	layout.setVisibility(View.VISIBLE);
    }
    
}
