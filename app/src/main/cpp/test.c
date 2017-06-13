//
//Test for FFmpeg
// Created by lijian on 2017/6/13.
//
#include <android/log.h>
#include <jni.h>

#include "libavformat/avformat.h"

#define TAG "FFmpeg"
#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, TAG, __VA_ARGS__)

jboolean Java_com_lijian_auidodemo_MainActivity_testFFmpeg(JNIEnv *env, jobject instance) {
    av_register_all();
    LOGV("av_register_all() success");
    return JNI_TRUE;
}
