package com.gtn.abhis.crackit4

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by abhis on 08-03-2018.
 */
class Item(val num1: String?, val num2: String?, val num3: String?, val num4: String?, val num5: String?, val iview1: Int, val iview2: Int, val iview3: Int, val iview4: Int, val iview5: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(num1)
        parcel.writeString(num2)
        parcel.writeString(num3)
        parcel.writeString(num4)
        parcel.writeString(num5)
        parcel.writeInt(iview1)
        parcel.writeInt(iview2)
        parcel.writeInt(iview3)
        parcel.writeInt(iview4)
        parcel.writeInt(iview5)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }

        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }
}