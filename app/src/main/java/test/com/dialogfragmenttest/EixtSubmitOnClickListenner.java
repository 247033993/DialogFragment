package test.com.dialogfragmenttest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 创建时间: 17/9/7
 * 编写人：HBB
 * 描述：
 */

public abstract class EixtSubmitOnClickListenner implements Parcelable {
    public abstract void onEixtSubmitOnClick();


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public EixtSubmitOnClickListenner() {
    }

    protected EixtSubmitOnClickListenner(Parcel in) {
    }

    public static final Parcelable.Creator<EixtSubmitOnClickListenner> CREATOR = new Parcelable.Creator<EixtSubmitOnClickListenner>() {
        @Override
        public EixtSubmitOnClickListenner createFromParcel(Parcel source) {
            return new EixtSubmitOnClickListenner(source){
                @Override
                public void onEixtSubmitOnClick() {

                }
            };
        }

        @Override
        public EixtSubmitOnClickListenner[] newArray(int size) {
            return new EixtSubmitOnClickListenner[size];
        }
    };
}
