package test.com.dialogfragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"fdvfbrb",Toast.LENGTH_LONG).show();
    }
    public void start(View view){
        MessageDialog.init().setMsg("消息").outCancel(false).setSubmitOnClickListenner(new SubmitOnClickListenner() {
            @Override
            public void onSubmitOnClick() {
                finish();
            }
        }).show(getSupportFragmentManager());
    }
}
