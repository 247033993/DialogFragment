package test.com.dialogfragmenttest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 创建时间: 17/9/7
 * 编写人：HBB
 * 描述：
 */

public abstract class SubmitOnClickListenner implements Parcelable {
    public abstract void onSubmitOnClick();

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public SubmitOnClickListenner() {
    }

    protected SubmitOnClickListenner(Parcel in) {
    }

    public static final Parcelable.Creator<SubmitOnClickListenner> CREATOR = new Parcelable.Creator<SubmitOnClickListenner>() {
        @Override
        public SubmitOnClickListenner createFromParcel(Parcel source) {
            return new SubmitOnClickListenner(source){

                @Override
                public void onSubmitOnClick() {

                }
            };
        }

        @Override
        public SubmitOnClickListenner[] newArray(int size) {
            return new SubmitOnClickListenner[size];
        }
    };
}