package com.googlesource.gerrit.plugins.merge_suspend;

import com.google.gerrit.extensions.config.CapabilityDefinition;

class MergeSuspendCapability extends CapabilityDefinition {
  static final String MERGE_SUSPEND = "merge-suspend";

  @Override
  public String getDescription() {
    return "Suspend merges";
  }
}
