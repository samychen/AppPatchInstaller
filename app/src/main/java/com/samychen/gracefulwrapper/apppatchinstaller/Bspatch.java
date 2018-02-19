package com.samychen.gracefulwrapper.apppatchinstaller;

public class Bspatch {
    public native static int patch(String oldfile, String newFile, String patchFile);

    static {
        System.loadLibrary("BisPatch");
    }
}
