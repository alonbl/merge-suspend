package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.gerrit.sshd.PluginCommandModule;

public class SshModule extends PluginCommandModule {
    @Override
    protected void configureCommands() {
        command(MergeSuspendCommand.class);
        command(MergeResumeCommand.class);
    }
}
