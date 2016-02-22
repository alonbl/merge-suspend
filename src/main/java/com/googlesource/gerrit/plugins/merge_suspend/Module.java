package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.gerrit.extensions.annotations.Exports;
import com.google.gerrit.extensions.config.CapabilityDefinition;
import com.google.gerrit.extensions.registration.DynamicSet;
import com.google.gerrit.server.git.validators.MergeValidationListener;
import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        DynamicSet.bind(binder(), MergeValidationListener.class)
            .to(MergeValidator.class);
        bind(CapabilityDefinition.class)
            .annotatedWith(Exports.named(MergeSuspendCapability.MERGE_SUSPEND))
            .to(MergeSuspendCapability.class);
    }

}
