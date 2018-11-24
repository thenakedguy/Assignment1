package com.example.hngdng.assignment1.Thu;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class adapter extends FragmentStatePagerAdapter {
    private String listTab[] = {"Khoản Thu","Loại Thu"};
    KhoanThu khoanThu;
    LoaiThu loaiThu;
    public adapter(FragmentManager fm) {
        super(fm);
        khoanThu = new KhoanThu();
        loaiThu = new LoaiThu();
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return khoanThu;
        }else {
            return loaiThu;
        }
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}
