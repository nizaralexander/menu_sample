package in.nizar.menusample;

import android.app.*;
import android.os.*;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity 
{
	
	// main satu mznizar
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		// membuka xml main.xml
        setContentView(R.layout.main);
		
	    //home bar icon
		getSupportActionBar().setDisplayHomeAsUpEnabled(false);
		// aktif true false mati titel bar
		getSupportActionBar().setDisplayShowTitleEnabled(true);
		
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		// atas ane menu mznizar
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/* cari item nizar */
		int nizar = item.getItemId();

		/* setting mz nizar */	
		if (nizar == R.id.action_settings){
			finish();
		return false;
	    }
		/* about mz nizar */
		if (nizar == R.id.about){
			finish();
			return false;
		}
		/* terserah nte mau di tambah apa
		
		if (nizar == R.id.new)
		{
			retrun false;
		}
		
		*/
		return super.onOptionsItemSelected(item);
   }
}
