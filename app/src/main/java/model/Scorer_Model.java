package model;

import android.widget.LinearLayout;
import android.widget.TextView;

public class Scorer_Model {
    String groupid;

    public Scorer_Model(String groupid) {
        this.groupid = groupid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
}
