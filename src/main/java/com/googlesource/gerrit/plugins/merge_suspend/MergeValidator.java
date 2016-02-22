package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.gerrit.reviewdb.client.Branch;
import com.google.gerrit.reviewdb.client.PatchSet;
import com.google.gerrit.server.git.CodeReviewCommit;
import com.google.gerrit.server.git.CommitMergeStatus;
import com.google.gerrit.server.git.validators.MergeValidationException;
import com.google.gerrit.server.git.validators.MergeValidationListener;
import com.google.gerrit.server.project.ProjectState;
import com.google.inject.Inject;

import org.eclipse.jgit.lib.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeValidator implements MergeValidationListener {

    private static final Logger log = LoggerFactory.getLogger(MergeValidator.class);

    @Inject
    private State state;

    /**
     * Validate a commit before it is merged.
     *
     * @param repo the repository
     * @param commit commit details
     * @param destProject the destination project
     * @param destBranch the destination branch
     * @param patchSetId the patch set ID
     * @throws MergeValidationException if the commit fails to validate
     */
    @Override
    public void onPreMerge(Repository repo,
    CodeReviewCommit commit,
        ProjectState destProject,
        Branch.NameKey destBranch,
        PatchSet.Id patchSetId)
        throws MergeValidationException {

        if (state.mergeSuspend) {
            log.warn("Merges are suspended");
            throw new MergeValidationException(CommitMergeStatus.MISSING_DEPENDENCY);
        }
    }
}
