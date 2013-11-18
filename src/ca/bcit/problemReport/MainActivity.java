package ca.bcit.problemReport;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
	
	TextView name;
	CheckBox checkBox;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        name = (TextView) findViewById(R.id.textView1);
		 
		checkBox = (CheckBox) findViewById(R.id.checkBox1);
        checkBox.setOnClickListener(this);
       
        if (checkBox.isChecked()) {
            name.setText(R.string.software_problem_report);
        } else {
        	name.setText(R.string.engineer);
        }
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
	     
		 if (checkBox.isChecked()) {
	            name.setText(R.string.software_problem_report);
	        } else {
	        	name.setText(R.string.engineer);
	        }
	}


	
    
}
