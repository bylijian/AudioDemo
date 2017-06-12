#include <jni.h>
#include <string.h>

//For Log
#include <android/log.h>

#define TAG "NativeAudio"
#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, TAG, __VA_ARGS__)

jboolean
Java_com_lijian_auidodemo_MainActivity_nativePlay(JNIEnv *env, jobject instance, jstring mp3File_) {
    const char *mp3File = (*env)->GetStringUTFChars(env, mp3File_, NULL);
    LOGV("start nativePlay() %s!\n", mp3File);
    jboolean result = JNI_TRUE;
    (*env)->ReleaseStringUTFChars(env, mp3File_, mp3File);
    return result;
}

jboolean Java_com_lijian_auidodemo_MainActivity_nativeStop(JNIEnv *env, jobject instance) {
    LOGV("start nativeStop()!\n");
    jboolean result = JNI_TRUE;
    return result;
}

jboolean Java_com_lijian_auidodemo_MainActivity_nativePause(JNIEnv *env, jobject instance) {
    LOGV("start nativePause()!\n");
    jboolean result = JNI_TRUE;
    return result;
}
