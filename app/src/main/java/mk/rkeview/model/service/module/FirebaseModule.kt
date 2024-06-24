package mk.rkeview.model.service.module

import dagger.Module
import dagger.Provides
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


// DON'T TOUCH THIS
// it creates a firestore singleton

@InstallIn(SingletonComponent::class)
@Module
object FirebaseModule {
    @Provides
    fun firestore(): FirebaseFirestore = Firebase.firestore

    //    @Provides fun auth(): FirebaseAuth = Firebase.auth
}