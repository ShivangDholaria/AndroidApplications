package com.example.ttsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextToSpeech tts;
    private EditText editText;
    private Button say_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        say_button = findViewById(R.id.say_button);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    int result = tts.setLanguage(Locale.ENGLISH);

                    if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
                        Log.e("TTS", "Language not supported");
                    else
                    {
                        say_button.setEnabled(true);
                    }
                }
                else {
                    Log.e("TTS", "TTS failed to start");
                }
            }
        });

        editText = findViewById(R.id.editText);

        say_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }

    private void speak(){
        String text = editText.getText().toString();
        tts.setPitch(0.8f);
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    protected void onDestroy() {
        if(tts != null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}