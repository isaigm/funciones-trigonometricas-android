package com.example.funcionestrigonometricas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.lang.Math;
import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    static int ang = 0;
    static String res = "0";
    static TextView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        RadioGroup rGroup = (RadioGroup)findViewById(R.id.radio_group1);
        RadioGroup angles = (RadioGroup)findViewById(R.id.radio_group);
        result = findViewById(R.id.res);
        angles.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if(isChecked)
                {
                    ImageView image = findViewById(R.id.imageView1);
                    if(checkedId == R.id.sin){
                        ang = 0;
                    }
                    if(checkedId == R.id.cos)
                    {
                        ang = 1;
                    }
                    if(checkedId == R.id.tan)
                    {
                        ang = 2;
                    }
                }
            }
        });
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if(isChecked)
                {
                    ImageView image = findViewById(R.id.imageView1);
                    if(checkedId == R.id.r45){
                        image.setImageResource(R.drawable.r45);
                        switch (ang)
                        {
                            case 0:
                                res = String.valueOf(Math.sin(Math.PI / 4));
                                result.setText(res);
                                break;
                            case 1:
                                res = String.valueOf(Math.cos(Math.PI / 4));
                                result.setText(res);
                                break;
                            case 2:
                                res = String.valueOf(Math.tan(Math.PI / 4));
                                result.setText(res);
                                break;
                        }
                    }
                    if(checkedId == R.id.r90)
                    {
                        image.setImageResource(R.drawable.r90);
                        switch (ang)
                        {
                            case 0:
                                res = String.valueOf(Math.sin(Math.PI / 2));
                                result.setText(res);
                                break;
                            case 1:
                                res = String.valueOf(Math.cos(Math.PI / 2));
                                result.setText(res);
                                break;
                            case 2:
                                res = "Error de dominio";
                                result.setText(res);
                                break;
                        }

                    }
                    if(checkedId == R.id.r180)
                    {
                        image.setImageResource(R.drawable.r180);
                        switch (ang)
                        {
                            case 0:
                                res = String.valueOf(Math.sin(Math.PI));
                                result.setText(res);
                                break;
                            case 1:
                                res = String.valueOf(Math.cos(Math.PI));
                                result.setText(res);
                                break;
                            case 2:
                                res = String.valueOf(Math.tan(Math.PI));
                                result.setText(res);
                                break;
                        }
                    }
                }
            }
        });
    }
}
