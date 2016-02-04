package com.example.liuzhu.slidingmenudemo.Index;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.liuzhu.slidingmenudemo.Left.LeftFragment;
import com.example.liuzhu.slidingmenudemo.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class IndexActivity extends SlidingFragmentActivity {
    private SlidingMenu menu;
    private Button btn_showside;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        final View view = View.inflate(this,R.layout.index_activity,null);
        setContentView(view);

        initView(view);
        initData();
        initLisenner();
    }

    private void initView(View view) {
        btn_showside = (Button)view.findViewById(R.id.index_showside_btn);
        initSideMenu();
    }

    private void initSideMenu() {
        setBehindContentView(R.layout.menu_frame);
        getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame,new LeftFragment()).commit();
        // 设置滑动菜单的属性值
        menu = getSlidingMenu();
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen.left_offset);
        // 淡入淡出效果
        menu.setFadeDegree(0.3f);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
    }

    private void initData() {

    }

    private void initLisenner() {
        btn_showside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.toggle();
            }
        });
    }

}
