package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.inject.Singleton;

@Singleton
public class State {

    public static volatile boolean mergeSuspend = false;

}
