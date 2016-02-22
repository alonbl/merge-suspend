package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.gerrit.extensions.annotations.RequiresCapability;
import com.google.gerrit.sshd.CommandMetaData;
import com.google.gerrit.sshd.SshCommand;
import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiresCapability(MergeSuspendCapability.MERGE_SUSPEND)
@CommandMetaData(name = "merge-suspend", description = "Suspend merges")
public final class MergeSuspendCommand extends SshCommand {

    private static final Logger log = LoggerFactory.getLogger(MergeSuspendCommand.class);

    @Inject
    private State state;

    @Override
    protected void run() {
        log.info("Merges are suspended");
        state.mergeSuspend = true;
    }
}
