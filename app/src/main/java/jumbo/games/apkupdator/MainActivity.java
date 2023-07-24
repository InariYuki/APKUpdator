package jumbo.games.apkupdator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.redirectErrorStream();
        processBuilder.command("/storage/emulated/0/Download/update.sh");
        try{
            Process process = processBuilder.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}