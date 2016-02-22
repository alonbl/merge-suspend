include_defs('//bucklets/gerrit_plugin.bucklet')

gerrit_plugin(
  name = 'merge-suspend-plugin',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/**/*']),
  manifest_entries = [
    'Gerrit-PluginName: merge-suspend',
    'Gerrit-Module: com.googlesource.gerrit.plugins.merge_suspend.Module',
    'Gerrit-SshModule: com.googlesource.gerrit.plugins.merge_suspend.SshModule',
    'Implementation-Title: Merge Suspend plugin',
    'Implementation-URL: https://github.com/alonbl/merge-suspend',
  ]
)
