# SlidingMenuDemo
## 滑动侧边栏

#### USAGE

1. 初始化侧边栏
    
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
    
2. 打开/关闭
    
  menu.toggle();
  

