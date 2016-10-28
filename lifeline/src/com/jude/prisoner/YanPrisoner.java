package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by 大男孩 on 2016/10/28.
 */
public class YanPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;
    @Override
    public String getName() {
        return "严以宁2016210045";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {

    }

    @Override
    public int take(int index, int last) {
        return 100;//学长我放弃了自己写的算法存活率还没有固定取100高
    }

    @Override
    public void result(boolean survived) {

    }
}
