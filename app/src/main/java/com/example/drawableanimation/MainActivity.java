package com.example.drawableanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {//클래스를 상속받아 MainActivity 클래스를 작성한다.
    AnimationDrawable rocketAnimation; //rocketAnimation을 선언한다.

    @Override
    public void onCreate(Bundle savedInstanceState) { //onCreat 메소드의 매개변수는 이전 실행 상태를 전달한다.
        super.onCreate(savedInstanceState); //상위클래스의 onCreat를 호출한다.
        setContentView(R.layout.activity_main); //메인으로 띄운다.
        ImageView rocketImage = (ImageView) findViewById(R.id.rocket_image);//이미지뷰의 정보를 가져온다.
        rocketImage.setBackgroundResource(R.drawable.rocket);
        //rocket.xml 애니메이션 리소스를 이미지 뷰의 배경으로 설정한다.
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground(); //애니메이션 객체를 얻는다.
    }

    public boolean onTouchEvent(MotionEvent event){ //onTouchEvent 생성자가 객체 MotionEvent event를 생성한다.
        if (event.getAction() == MotionEvent.ACTION_DOWN){ //motionEvent를 누르면
            rocketAnimation.start(); //화면이 터치되면 애니메이션을 시작한다.
            return true;
        }
        return super.onTouchEvent(event); //상위클래스로 event 정보를 전달한다.
    }
}
