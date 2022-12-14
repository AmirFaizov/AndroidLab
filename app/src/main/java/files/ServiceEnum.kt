package files

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class ServiceEnum : Parcelable {
    START_SERVICE, PRELOAD_IMAGE, DISPLAY_IMAGE, STOP_SERVICE
}