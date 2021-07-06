package com.example.responsi1_ahmadrafli;

import android.os.Parcel;
import android.os.Parcelable;

public class Distro implements Parcelable {
    private String name;
    private String info;
    private int logo;

    public Distro(String name, String info, int logo) {
        this.name = name;
        this.info = info;
        this.logo = logo;
    }

    protected Distro(Parcel in) {
        name = in.readString();
        info = in.readString();
        logo = in.readInt();
    }

    public static final Creator<Distro> CREATOR = new Creator<Distro>() {
        @Override
        public Distro createFromParcel(Parcel in) {
            return new Distro(in);
        }

        @Override
        public Distro[] newArray(int size) {
            return new Distro[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getLogo() {
        return logo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(info);
        dest.writeInt(logo);
    }
}