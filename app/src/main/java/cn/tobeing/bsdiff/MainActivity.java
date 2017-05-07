package cn.tobeing.bsdiff;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

import cn.tobeing.bsdiff.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path = this.getExternalCacheDir().getPath();
        Log.e("suntest", "path=" + path);
        int result = BsdiffApi.bspatch(path + "/oldfile", path + "/newfile", path + "/patch");
        Log.e("suntest", "result=" + result);
    }
}
