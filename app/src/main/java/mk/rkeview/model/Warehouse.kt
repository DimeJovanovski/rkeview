package mk.rkeview.model

import android.util.Log
import com.google.firebase.firestore.DocumentId
import java.util.Date

// We store the Warehouse data in a bad format, this doesn't work

//data class Warehouse(
//    @DocumentId val id: String = "",
//    val data: Map<String, EnergyResourceData> = mapOf()
//) {
//    fun getLatest(): EnergyResourceData {
//        // each key is a date
//        //log it
//        //        logcat
//
//        Log.w("Warehouse", "data: ${data}")
//
//        return EnergyResourceData()
//    }
//}