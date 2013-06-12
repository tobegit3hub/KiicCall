package cn.chendihao.kiiccall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.finish();
        
        
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.heart);
		
        Toast toast = new Toast(this);
        toast.setView(imageView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        
        
        String tobeNumber = "626796";  //637104
		Intent intent = new Intent(Intent.ACTION_CALL);
		intent.setData(Uri.parse("tel:"+tobeNumber));
		startActivity(intent);

    }
}