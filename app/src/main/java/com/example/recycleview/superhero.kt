package com.example.recycleview

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class Superhero(
    val imgSuperhero: Int,
    val namaSuperhero: String?,
    val descSuperhero: String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imgSuperhero)
        parcel.writeString(namaSuperhero)
        parcel.writeString(descSuperhero)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Superhero> {
        override fun createFromParcel(parcel: Parcel): Superhero {
            return Superhero(parcel)
        }

        override fun newArray(size: Int): Array<Superhero?> {
            return arrayOfNulls(size)
        }
    }
}