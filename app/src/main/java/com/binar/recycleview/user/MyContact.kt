package com.binar.recycleview.user

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyContact (val nama:String , val noHp : Long):Parcelable