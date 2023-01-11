package com.example.internassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.internassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'internassignment' library on application startup.
    static {
        System.loadLibrary("internassignment");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.textView;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'internassignment' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}