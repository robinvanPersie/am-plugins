package com.quan.api.base

import com.android.build.api.transform.JarInput

interface BaseTransformCallback<T> {

    String getPluginName();

    void onScanStarted();

    boolean isIgnoreScan(JarInput input);

    void scanClassFile(File classFile, String className, File originScannedJarOrDir);

    void onScanFinished();
}