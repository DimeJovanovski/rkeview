package mk.rkeview.model.module;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FirebaseModule_FirestoreFactory implements Factory<FirebaseFirestore> {
  @Override
  public FirebaseFirestore get() {
    return firestore();
  }

  public static FirebaseModule_FirestoreFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseFirestore firestore() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.firestore());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_FirestoreFactory INSTANCE = new FirebaseModule_FirestoreFactory();
  }
}
